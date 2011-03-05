package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("goFastItemDTO")
public class GoFastItemDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@XStreamAlias("gfiId")
	private Integer gfiId;

	@XStreamAlias("gfiDetail")
	private String gfiDetail;

	@XStreamAlias("gfiDiscount")
	private String gfiDiscount;

	@XStreamAlias("gfiName")
	private String gfiName;

	@XStreamAlias("gfiStatus")
	private String gfiStatus;

	@XStreamAlias("goFastCustomer")
	private GoFastCustomerDTO goFastCustomer;

	@XStreamAlias("goFastCat")
	private GoFastCatDTO goFastCat;
/*
	@XStreamAlias("goFastLocation")
	private GoFastLocationDTO goFastLocation;*/

	@XStreamAlias("goFastArea")
	private GoFastAreaDTO goFastArea;

    public GoFastItemDTO() {
    }

	public Integer getGfiId() {
		return gfiId;
	}

	public void setGfiId(Integer gfiId) {
		this.gfiId = gfiId;
	}

	public String getGfiDetail() {
		return gfiDetail;
	}

	public void setGfiDetail(String gfiDetail) {
		this.gfiDetail = gfiDetail;
	}

	public String getGfiDiscount() {
		return gfiDiscount;
	}

	public void setGfiDiscount(String gfiDiscount) {
		this.gfiDiscount = gfiDiscount;
	}

	public String getGfiName() {
		return gfiName;
	}

	public void setGfiName(String gfiName) {
		this.gfiName = gfiName;
	}

	public String getGfiStatus() {
		return gfiStatus;
	}

	public void setGfiStatus(String gfiStatus) {
		this.gfiStatus = gfiStatus;
	}

	public GoFastCustomerDTO getGoFastCustomer() {
		return goFastCustomer;
	}

	public void setGoFastCustomer(GoFastCustomerDTO goFastCustomer) {
		this.goFastCustomer = goFastCustomer;
	}

	public GoFastCatDTO getGoFastCat() {
		return goFastCat;
	}

	public void setGoFastCat(GoFastCatDTO goFastCat) {
		this.goFastCat = goFastCat;
	}

	public GoFastAreaDTO getGoFastArea() {
		return goFastArea;
	}

	public void setGoFastArea(GoFastAreaDTO goFastArea) {
		this.goFastArea = goFastArea;
	}

	 
	
}