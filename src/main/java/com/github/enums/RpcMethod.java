package com.github.enums;

public enum RpcMethod {

    GET_BALANCE("eth_getBalance"),

    GET_BLOCKS_BY_Number("eth_getBlockByNumber"),

    GET_TRADE_COUNT("eth_getTransactionCount"),

    GET_ETH_RECEIPT("eth_getTransactionReceipt"),

    SEND_RAWTRANSACTION("eth_sendRawTransaction"),

    GET_CURRENT_BLOCK("eth_blockNumber"),

    GET_TX_BY_HASHES("Chain33.GetTxByHashes");

    private String method;

    private RpcMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return getMethod();
    }
}
