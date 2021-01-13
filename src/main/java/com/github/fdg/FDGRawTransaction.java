package com.github.fdg;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;

import java.math.BigInteger;

public class FDGRawTransaction {
    public static RawTransaction createEtherTransaction(BigInteger nonce, BigInteger gasPrice, BigInteger gasLimit, String to, BigInteger value){
        RawTransaction rawTransaction = RawTransaction.createEtherTransaction(nonce, gasPrice, gasLimit, Numeric.containsHexPrefix(to)? to.substring(2) : to, value);
        return rawTransaction;
    }

    public static String signMessage(BigInteger nonce, BigInteger gasPrice, BigInteger gasLimit, String to, BigInteger value, String privateKey){
        Credentials credentials = Credentials.create(privateKey);
        RawTransaction rawTransaction = RawTransaction.createEtherTransaction(nonce, gasPrice, gasLimit, Numeric.containsHexPrefix(to)? to.substring(2) : to, value);
        byte[] signMessage = TransactionEncoder.signMessage(rawTransaction, credentials);
        String hexValue = org.web3j.utils.Numeric.toHexString(signMessage);
        return hexValue;
    };
}
