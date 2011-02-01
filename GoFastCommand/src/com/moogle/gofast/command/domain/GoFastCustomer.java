package com.moogle.gofast.command.domain;

import java.io.Serializable;
 

 
public class GoFastCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

 
	private Integer gfcId; 
	private String gfcDetail; 
	private String gfcEmail; 
	private String gfcIconName; 
	private String gfcIconPath; 
	private Double gfcLat; 
	private Double gfcLong; 
	private String gfcName; 
	private String gfcPhone; 
	private String gfcStatus;
	public Integer getGfcId() {
		return gfcId;
	}
	public void setGfcId(Integer gfcId) {
		this.gfcId = gfcId;
	}
	public String getGfcDetail() {
		return gfcDetail;
	}
	public void setGfcDetail(String gfcDetail) {
		this.gfcDetail = gfcDetail;
	}
	public String getGfcEmail() {
		return gfcEmail;
	}
	public void setGfcEmail(String gfcEmail) {
		this.gfcEmail = gfcEmail;
	}
	public String getGfcIconName() {
		return gfcIconName;
	}
	public void setGfcIconName(String gfcIconName) {
		this.gfcIconName = gfcIconName;
	}
	public String getGfcIconPath() {
		return gfcIconPath;
	}
	public void setGfcIconPath(String gfcIconPath) {
		this.gfcIconPath = gfcIconPath;
	}
	public Double getGfcLat() {
		return gfcLat;
	}
	public void setGfcLat(Double gfcLat) {
		this.gfcLat = gfcLat;
	}
	public Double getGfcLong() {
		return gfcLong;
	}
	public void setGfcLong(Double gfcLong) {
		this.gfcLong = gfcLong;
	}
	public String getGfcName() {
		return gfcName;
	}
	public void setGfcName(String gfcName) {
		this.gfcName = gfcName;
	}
	public String getGfcPhone() {
		return gfcPhone;
	}
	public void setGfcPhone(String gfcPhone) {
		this.gfcPhone = gfcPhone;
	}
	public String getGfcStatus() {
		return gfcStatus;
	}
	public void setGfcStatus(String gfcStatus) {
		this.gfcStatus = gfcStatus;
	}
 
	
	
}