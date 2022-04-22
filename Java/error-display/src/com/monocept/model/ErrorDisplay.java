package com.monocept.model;

public class ErrorDisplay {
	private String error;
	private String warning;
	private String info;
	
	public ErrorDisplay(String error1, String warning1,String info1) {
		this.error = error1;
		this.warning = warning1;
		this.info = info1;
	}
	public String getError() {
		System.out.println("2006-08-16 12:07:47,994 - ERROR - Unable to process login request for user \"user01\", identity provider did not respond to request"+"\n2006-08-16 12:07:10,278 - ERROR - Unable to process login request for user \"user42\", identity provider did not respond to request"+"\n2006-08-16 12:08:13,348 - ERROR - Unable to process login request for user \"user01\", identity provider did not respond to request"+"\n2006-08-16 12:09:00,741 - ERROR - Unable to process login request for user \"user01\", identity provider did not respond to request");
		return error;
	}
	
	public String getWarning() {
		System.out.println("2006-08-16 12:03:10,762 - WARNING - Failed to connect to datasource \"mydatasource\"");
		return warning;
	}

	
	public String getInfo() {
		System.out.println("2006-08-16 12:03:10,237 - INFO - Attempting to connect to data sources"+"\n2006-08-16 12:03:11,003 - INFO - Retrying to connect to \"mydatasource\""+"\n2006-08-16 12:03:12,127 - INFO - Connection to \"mydatasource\" succeeded after 2 attempts"+"\n2006-08-16 12:03:13,278 - INFO - MyApp started listening on port 8080"+"\n2006-08-16 12:10:10,357 - INFO - User with ID \"user27\" logged in"+"\n2006-08-16 12:12:10,856 - INFO - User with ID \"user42\" logged in");
		return info;
	}
	
}
