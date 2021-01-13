package com.github.model;

import java.util.List;

public class TransactionRecepit {

    private String blockHash;
    private String blockNumber;
    private String contractAddress;
    private String cumulativeGasUsed;
    private String from;
    private String gasUsed;
    private List<String> logs;
    private String logsBloom;
    private String root;
    private String to;
    private String transactionHash;
    private String transactionIndex;
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }
    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }
    public String getBlockNumber() {
        return blockNumber;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }
    public String getContractAddress() {
        return contractAddress;
    }

    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }
    public String getCumulativeGasUsed() {
        return cumulativeGasUsed;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }
    public String getGasUsed() {
        return gasUsed;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }
    public List<String> getLogs() {
        return logs;
    }

    public void setLogsBloom(String logsBloom) {
        this.logsBloom = logsBloom;
    }
    public String getLogsBloom() {
        return logsBloom;
    }

    public void setRoot(String root) {
        this.root = root;
    }
    public String getRoot() {
        return root;
    }

    public void setTo(String to) {
        this.to = to;
    }
    public String getTo() {
        return to;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }
    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }
    public String getTransactionIndex() {
        return transactionIndex;
    }
}
