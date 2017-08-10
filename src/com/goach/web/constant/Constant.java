package com.goach.web.constant;

public interface Constant {
	String databaseUser = "root";
	String password = "123456";

	String url = "jdbc:mysql://localhost:3306/goach?"
			+ "user="+databaseUser+"&password="+password+"&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
}
