package com.codingTest.demo.entities;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Check {
	
	//@Id
	private Integer CheckId;
	private String WebsiteName;
	private String WebsiteUrl;
	private Double Time;
	private String Status;
	public Check(int i, String websiteName, String websiteUrl, double d, String status) {
		super();
		CheckId = i;
		WebsiteName = websiteName;
		WebsiteUrl = websiteUrl;
		Time = d;
		Status = status;
	}
	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCheckId() {
		return CheckId;
	}
	public void setCheckId(Integer checkId) {
		CheckId = checkId;
	}
	public String getWebsiteName() {
		return WebsiteName;
	}
	public void setWebsiteName(String websiteName) {
		WebsiteName = websiteName;
	}
	public String getWebsiteUrl() {
		return WebsiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		WebsiteUrl = websiteUrl;
	}
	public Double getTime() {
		return Time;
	}
	public void setTime(Double time) {
		Time = time;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Check [CheckId=" + CheckId + ", WebsiteName=" + WebsiteName + ", WebsiteUrl=" + WebsiteUrl + ", Time="
				+ Time + ", Status=" + Status + "]";
	}

}
