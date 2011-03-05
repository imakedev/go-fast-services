package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("goFastLocationDTO")
public class GoFastLocationDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@XStreamAlias("gflId")
	private Integer gflId;

	@XStreamAlias("gflDetail")
	private String gflDetail;

	@XStreamAlias("gflName")
	private String gflName;

	 
    public GoFastLocationDTO() {
    }


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