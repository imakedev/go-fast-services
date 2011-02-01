package com.moogle.gofast.command.domain;

import java.io.Serializable;

 
public class GoFastItem implements Serializable {
	private static final long serialVersionUID = 1L;

	 
	private Integer gfiId; 
	private String gfiDetail; 
	private String gfiDiscount; 
	private String gfiName; 
	private String gfiStatus;
 
	private Integer gfcId; 
 
	private Integer gfcaId; 
	
	private Integer gfaId;

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

	public Integer getGfcId() {
		return gfcId;
	}

	public void setGfcId(Integer gfcId) {
		this.gfcId = gfcId;
	}

	public Integer getGfcaId() {
		return gfcaId;
	}

	public void setGfcaId(Integer gfcaId) {
		this.gfcaId = gfcaId;
	}

	public Integer getGfaId() {
		return gfaId;
	}

	public void setGfaId(Integer gfaId) {
		this.gfaId = gfaId;
	}  

	
   }