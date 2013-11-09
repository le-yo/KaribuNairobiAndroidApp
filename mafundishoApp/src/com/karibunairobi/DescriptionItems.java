package com.karibunairobi;

/**
 * Store information about a car.
 */
public class DescriptionItems {
	//private String pos;
	//private String position;
	private int bg;
	//private String condition;
	private String Description;
	private String log;
	private String lat;
	private String contact;
	private String strTest;
	
	
	public DescriptionItems(int pos, int position, int bg,String strTest) {
		super();
		this.bg = bg;
		//this.year = year;
		this.Description = Description;
		this.strTest = strTest;
		this.log = log;
		this.lat = lat;
		this.contact = contact;
	}
	
	public int getbg() {
		return bg;
	}
	public String getDescription() {
		
	
		return strTest;
	}
	public String getContact() {
		return contact;
	}
	public String getLat() {
		return lat;
	}
	public String getLog() {
		return log;
	}
}
