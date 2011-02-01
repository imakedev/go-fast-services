package com.moogle.gofast.command.domain;

import java.io.Serializable;
 

 
public class GoFastArea implements Serializable {
	private static final long serialVersionUID = 1L;
 
	private Integer gfaId;
 
	private String gfaDetail;
 
	private String gfaName;
 
    private Integer gflId;

	public Integer getGfaId() {
		return gfaId;
	}

	public void setGfaId(Integer gfaId) {
		this.gfaId = gfaId;
	}

	public String getGfaDetail() {
		return gfaDetail;
	}

	public void setGfaDetail(String gfaDetail) {
		this.gfaDetail = gfaDetail;
	}

	public String getGfaName() {
		return gfaName;
	}

	public void setGfaName(String gfaName) {
		this.gfaName = gfaName;
	}

	public Integer getGflId() {
		return gflId;
	}

	public void setGflId(Integer gflId) {
		this.gflId = gflId;
	}
    
    
	
}