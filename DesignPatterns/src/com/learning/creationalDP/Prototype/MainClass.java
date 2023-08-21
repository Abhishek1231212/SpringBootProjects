package com.learning.creationalDP.Prototype;



public class MainClass {
	public static void main(String[] args) {
		NetworkConnection connection = new NetworkConnection();
		connection.setIp("192.168.1.1");
		connection.setConn("Connection1");
		connection.longConnection();
		System.out.println(connection);
		
		NetworkConnection network = (NetworkConnection) connection.clone();
		
		network.longConnection();
		
	}
}
