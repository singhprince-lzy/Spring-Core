package com.prince.spring.propertyplaceholder;

public class MyDao {
	private String dbServer;
	public MyDao(String dbServer) {
		this.dbServer=dbServer;
	}
	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + "]";
	}
	
}
