package com.moogle.gofast.services.hibernate.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the GO_FAST_AREA database table.
 * 
 */
@Entity
@Table(name="GO_FAST_AREA")
public class GoFastArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GFA_ID")
	private Integer gfaId;

	@Column(name="GFA_DETAIL")
	private String gfaDetail;

	@Column(name="GFA_NAME")
	private String gfaName;
	
	//bi-directional many-to-one association to GoFastLocation
    @ManyToOne
	@JoinColumn(name="GFL_ID")
	private GoFastLocation goFastLocation;

/*
	//bi-directional many-to-one association to GoFastItem
	@OneToMany(mappedBy="goFastArea")
	private Set<GoFastItem> goFastItems;*/

    public GoFastArea() {
    }

	 

	public Integer getGfaId() {
		return gfaId;
	}



	public void setGfaId(Integer gfaId) {
		this.gfaId = gfaId;
	}



	public String getGfaDetail() {
		return this.gfaDetail;
	}

	public void setGfaDetail(String gfaDetail) {
		this.gfaDetail = gfaDetail;
	}

	public String getGfaName() {
		return this.gfaName;
	}

	public void setGfaName(String gfaName) {
		this.gfaName = gfaName;
	}



	public GoFastLocation getGoFastLocation() {
		return goFastLocation;
	}



	public void setGoFastLocation(GoFastLocation goFastLocation) {
		this.goFastLocation = goFastLocation;
	}

	 
	
}