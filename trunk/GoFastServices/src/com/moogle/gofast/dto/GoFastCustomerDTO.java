package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("goFastCustomerDTO")
public class GoFastCustomerDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("gfcId")
	private Integer gfcId;

	@XStreamAlias("gfcDetail")
	private String gfcDetail;

	@XStreamAlias("gfcEmail")
	private String gfcEmail;

	@XStreamAlias("gfcIconName")
	private String gfcIconName;

	@XStreamAlias("gfcIconPath")
	private String gfcIconPath;

	@XStreamAlias("gfcLat")
	private String gfcLat;

	@XStreamAlias("gfcLong")
	private String gfcLong;

	@XStreamAlias("gfcName")
	private String gfcName;

	@XStreamAlias("gfcPhone")
	private String gfcPhone;

	@XStreamAlias("gfcStatus")
	private String gfcStatus;
 
    public GoFastCustomerDTO() {
    }

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

	public String getGfcLat() {
		return gfcLat;
	}

	public void setGfcLat(String gfcLat) {
		this.gfcLat = gfcLat;
	}

	public String getGfcLong() {
		return gfcLong;
	}

	public void setGfcLong(String gfcLong) {
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