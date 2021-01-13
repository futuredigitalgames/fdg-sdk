package com.github.model;

public class Transactions {

    private String blockHash;
    private String transactionIndex;
    private String nonce;
    private String input;
    private String r;
    private String s;
    private String v;
    private String blockNumber;
    private String gas;
    private String from;
    private String to;
    private String value;
    private String hash;
    private String gasPrice;
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }
    public String getBlockHash() {
        return blockHash;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }
    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
    public String getNonce() {
        return nonce;
    }

    public void setInput(String input) {
        this.input = input;
    }
    public String getInput() {
        return input;
    }

    public void setR(String r) {
        this.r = r;
    }
    public String getR() {
        return r;
    }

    public void setS(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }

    public void setV(String v) {
        this.v = v;
    }
    public String getV() {
        return v;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }
    public String getBlockNumber() {
        return blockNumber;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
    public String getGas() {
        return gas;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from.replaceFirst("0x","Gs");
    }

    public void setTo(String to) {
        this.to = to;
    }
    public String getTo() {
        return to.replaceFirst("0x","Gs");
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getHash() {
        return hash;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }
    public String getGasPrice() {
        return gasPrice;
    }
}
