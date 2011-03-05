package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("goFastCatDTO")
public class GoFastCatDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@XStreamAlias("gfcaId")
	private Integer gfcaId;

	@XStreamAlias("gfcaDetail")
	private String gfcaDetail;

	@XStreamAlias("gfcaIconName")
	private String gfcaIconName;

	@XStreamAlias("gfcaIconPath")
	private String gfcaIconPath;

	@XStreamAlias("gfcaName")
	private String gfcaName;

	@XStreamAlias("gfcaLevel")
	private Integer gfcaLevel;
	
	@XStreamAlias("gfcaParent")
	private Integer gfcaParent;
 

    public GoFastCatDTO() {
    }


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