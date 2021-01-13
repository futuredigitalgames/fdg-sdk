package com.github.rpc;
import com.alibaba.fastjson.JSONObject;
import com.github.enums.RpcMethod;
import com.github.model.BlockResult;
import com.github.model.RpcRequest;
import com.github.model.TransactionRecepit;
import com.github.utils.HttpUtil;
import com.github.utils.StringUtil;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class RpcClient {

    private String BASE_URL;

    public RpcClient() {
    }

    public RpcClient(String url) {
        this.BASE_URL = url;
    }

    public RpcClient(String host, Integer port) {
        this.BASE_URL = "http://" + host + ":" + port;
    }

    public void setBASE_URL(String bASE_URL) {
        BASE_URL = bASE_URL;
    }

    public void setUrl(String host, Integer port) {
        this.BASE_URL = "http://" + host + ":" + port;
    }

    public void setUrl(String url) {
        this.BASE_URL = url;
    }


    public String sendRawTransaction(String signValue){
        RpcRequest postData = getPostData(RpcMethod.SEND_RAWTRANSACTION);

        postData.addParamsList(signValue);
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (StringUtil.isNotEmpty(result)) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            String txHash =parseObject.getString("result");

            return txHash;
        }
        return null;
    }
    public BigInteger getCurrentBlock(){
        RpcRequest postData = getPostData(RpcMethod.GET_CURRENT_BLOCK);
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (StringUtil.isNotEmpty(result)) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            String balance =parseObject.getString("result").replaceFirst("0x","");

            BigInteger bigint=new BigInteger(balance, 16);
            return bigint;

        }
        return null;
    }


    public BigInteger getTradeCount(String address){
        RpcRequest postData = getPostData(RpcMethod.GET_TRADE_COUNT);
        postData.addParamsList(address.replaceFirst("Gs","0x"));
        postData.addParamsList("latest");
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (StringUtil.isNotEmpty(result)) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            String balance =parseObject.getString("result").replaceFirst("0x","");

            BigInteger bigint=new BigInteger(balance, 16);
            return bigint;

        }
        return null;
    }

    public BigDecimal getBalance(String address){
        RpcRequest postData = getPostData(RpcMethod.GET_BALANCE);
        postData.addParamsList(address.replaceFirst("Gs","0x"));
        postData.addParamsList("latest");
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (StringUtil.isNotEmpty(result)) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            String balance =parseObject.getString("result").replaceFirst("0x","");

            BigInteger bigint=new BigInteger(balance, 16);
            BigDecimal finalResult=Convert.fromWei(String.valueOf(bigint), Convert.Unit.ETHER);
            System.out.println(finalResult);
            return finalResult;

        }
        return null;
    }

    public BlockResult getBlock(Long start, boolean isDetail) {

        RpcRequest postData = getPostData(RpcMethod.GET_BLOCKS_BY_Number);
        String data=Integer.toHexString(start.intValue());
        System.out.println(data);
        postData.addParamsList("0x"+data);
        postData.addParamsList(true);
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (result!=null&&result.trim().length()>=0) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            JSONObject jsonObject =parseObject.getJSONObject("result");
            BlockResult javaObject = JSONObject.toJavaObject(jsonObject, BlockResult.class);
            System.out.println(jsonObject);
            return javaObject;
        }
        return null;
    };

    public TransactionRecepit getTransactionReceipt(String txHash){
        RpcRequest postData = getPostData(RpcMethod.GET_ETH_RECEIPT);
        postData.addParamsList(txHash);
        System.out.println(postData.toJsonString());
        String result = HttpUtil.httpPostBody(getUrl(), postData.toJsonString());
        System.out.println(result);
        if (result!=null&&result.trim().length()>=0) {
            JSONObject parseObject = JSONObject.parseObject(result);
            if (messageValidate(parseObject))
                return null;
            JSONObject jsonObject =parseObject.getJSONObject("result");
            TransactionRecepit javaObject = JSONObject.toJavaObject(jsonObject, TransactionRecepit.class);
            System.out.println(jsonObject);
            return javaObject;
        }
        return null;
    };

    private Boolean messageValidate(JSONObject parseObject) {
        if (parseObject != null && parseObject.containsKey("error")) {
            String error = parseObject.getString("error");
            if (StringUtil.isNotEmpty(error)) {
                System.err.println("rpc error:" + parseObject);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private RpcRequest getPostData(RpcMethod method) {
        RpcRequest postJsonData = new RpcRequest();
        postJsonData.setMethod(method);
        return postJsonData;
    }

    public String getUrl() {
        return BASE_URL;
    }
}
