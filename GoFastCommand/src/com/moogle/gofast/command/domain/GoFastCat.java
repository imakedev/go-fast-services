package com.moogle.gofast.command.domain;

import java.io.Serializable;
 

 
public class GoFastCat implements Serializable {
	private static final long serialVersionUID = 1L;

 
	private Integer gfcaId; 
	private String gfcaDetail; 
	private String gfcaIconName; 
	private String gfcaIconPath; 
	private String gfcaName;
	private Integer gfcaLevel;
	private Integer gfcaParent;
 
	public Integer getGfcaId() {
		return gfcaId;
	}
	public void setGfcaId(Integer gfcaId) {
		this.gfcaId = gfcaId;
	}
	public String getGfcaDetail() {
		return gfcaDetail;
	}
	public void setGfcaDetail(String gfcaDetail) {
		this.gfcaDetail = gfcaDetail;
	}
	public String getGfcaIconName() {
		return gfcaIconName;
	}
	public void setGfcaIconName(String gfcaIconName) {
		this.gfcaIconName = gfcaIconName;
	}
	public String getGfcaIconPath() {
		return gfcaIconPath;
	}
	public void setGfcaIconPath(String gfcaIconPath) {
		this.gfcaIconPath = gfcaIconPath;
	}
	public String getGfcaName() {
		return gfcaName;
	}
	public void setGfcaName(String gfcaName) {
		this.gfcaName = gfcaName;
	}
	public Integer getGfcaLevel() {
		return gfcaLevel;
	}
	public void setGfcaLevel(Integer gfcaLevel) {
		this.gfcaLevel = gfcaLevel;
	}
	public Integer getGfcaParent() {
		return gfcaParent;
	}
	public void setGfcaParent(Integer gfcaParent) {
		this.gfcaParent = gfcaParent;
	}
 
 
}