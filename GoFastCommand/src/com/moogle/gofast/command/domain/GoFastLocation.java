package com.moogle.gofast.command.domain;

import java.io.Serializable;

 
public class GoFastLocation implements Serializable {
	private static final long serialVersionUID = 1L;
 
	private Integer gflId; 
	private String gflDetail; 
	private String gflName;
	public Integer getGflId() {
		return gflId;
	}
	public void setGflId(Integer gflId) {
		this.gflId = gflId;
	}
	public String getGflDetail() {
		return gflDetail;
	}
	public void setGflDetail(String gflDetail) {
		this.gflDetail = gflDetail;
	}
	public String getGflName() {
		return gflName;
	}
	public void setGflName(String gflName) {
		this.gflName = gflName;
	}
 
    
	 
}