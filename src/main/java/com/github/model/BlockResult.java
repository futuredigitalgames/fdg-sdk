package com.github.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BlockResult implements Serializable{

	private static final long serialVersionUID = 1L;

	private String logsBloom;
	private String totalDifficulty;
	private String receiptsRoot;
	private String extraData;
	private List<Transactions> transactions;
	private String nonce;
	private String miner;
	private String difficulty;
	private String gasLimit;
	private String number;
	private String gasUsed;
	private List<String> uncles;
	private String sha3Uncles;
	private String size;
	private String transactionsRoot;
	private String stateRoot;
	private String mixHash;
	private String parentHash;
	private String hash;
	private String timestamp;
	public void setLogsBloom(String logsBloom) {
		this.logsBloom = logsBloom;
	}
	public String getLogsBloom() {
		return logsBloom;
	}

	public void setTotalDifficulty(String totalDifficulty) {
		this.totalDifficulty = totalDifficulty;
	}
	public String getTotalDifficulty() {
		return totalDifficulty;
	}

	public void setReceiptsRoot(String receiptsRoot) {
		this.receiptsRoot = receiptsRoot;
	}
	public String getReceiptsRoot() {
		return receiptsRoot;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}
	public String getExtraData() {
		return extraData;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getNonce() {
		return nonce;
	}

	public void setMiner(String miner) {
		this.miner = miner;
	}
	public String getMiner() {
		return miner.replaceFirst("0x","Gs");
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getDifficulty() {
		return difficulty;
	}

	public void setGasLimit(String gasLimit) {
		this.gasLimit = gasLimit;
	}
	public String getGasLimit() {
		return gasLimit;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}

	public void setGasUsed(String gasUsed) {
		this.gasUsed = gasUsed;
	}
	public String getGasUsed() {
		return gasUsed;
	}

	public void setUncles(List<String> uncles) {
		this.uncles = uncles;
	}
	public List<String> getUncles() {
		return uncles;
	}

	public void setSha3Uncles(String sha3Uncles) {
		this.sha3Uncles = sha3Uncles;
	}
	public String getSha3Uncles() {
		return sha3Uncles;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}

	public void setTransactionsRoot(String transactionsRoot) {
		this.transactionsRoot = transactionsRoot;
	}
	public String getTransactionsRoot() {
		return transactionsRoot;
	}

	public void setStateRoot(String stateRoot) {
		this.stateRoot = stateRoot;
	}
	public String getStateRoot() {
		return stateRoot;
	}

	public void setMixHash(String mixHash) {
		this.mixHash = mixHash;
	}
	public String getMixHash() {
		return mixHash;
	}

	public void setParentHash(String parentHash) {
		this.parentHash = parentHash;
	}
	public String getParentHash() {
		return parentHash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getHash() {
		return hash;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTimestamp() {
		return timestamp;
	}


}
