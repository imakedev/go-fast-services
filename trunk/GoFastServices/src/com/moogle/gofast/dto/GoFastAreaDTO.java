package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("goFastAreaDTO")
public class GoFastAreaDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("gfaId")
	private Integer gfaId;

	@XStreamAlias("gfaDetail")
	private String gfaDetail;

	@XStreamAlias("gfaName")
	private String gfaName;
	
	@XStreamAlias("goFastLocation")
	private GoFastLocationDTO goFastLocation;
	/*//bi-directional many-to-one association to GoFastItem
	@OneToMany(mappedBy="goFastArea")
	private Set<GoFastItemDTO> goFastItems;*/

    public GoFastAreaDTO() {
    }

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

	public GoFastLocationDTO getGoFastLocation() {
		return goFastLocation;
	}

	public void setGoFastLocation(GoFastLocationDTO goFastLocation) {
		this.goFastLocation = goFastLocation;
	}
    
    

	 
	
}