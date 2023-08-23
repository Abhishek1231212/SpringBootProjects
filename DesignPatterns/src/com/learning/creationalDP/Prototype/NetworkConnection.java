package com.learning.creationalDP.Prototype;



public class NetworkConnection implements Cloneable{
	private String ip;
	private String conn;
	
	public NetworkConnection() {
		
	}
	
	public String getIp() {
		return ip;
	}
	public String getConn() {
		return conn;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setConn(String conn) {
		this.conn = conn;
	}
	
	public void longConnection() {
		System.out.println("Complex Process");
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", conn=" + conn + "]";
	}

	@Override
	protected Object clone() {
		return this;
	}
	
	
}
