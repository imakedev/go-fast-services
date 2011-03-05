package com.moogle.gofast.services.hibernate.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the GO_FAST_CUSTOMER database table.
 * 
 */
@Entity
@Table(name="GO_FAST_CUSTOMER")
public class GoFastCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GFC_ID")
	private Integer gfcId;

	@Column(name="GFC_DETAIL")
	private String gfcDetail;

	@Column(name="GFC_EMAIL")
	private String gfcEmail;

	@Column(name="GFC_ICON_NAME")
	private String gfcIconName;

	@Column(name="GFC_ICON_PATH")
	private String gfcIconPath;

	@Column(name="GFC_LAT")
	private String gfcLat;

	@Column(name="GFC_LONG")
	private String gfcLong;

	@Column(name="GFC_NAME")
	private String gfcName;

	@Column(name="GFC_PHONE")
	private String gfcPhone;

	@Column(name="GFC_STATUS")
	private String gfcStatus;
/*
	//bi-directional many-to-one association to GoFastItem
	@OneToMany(mappedBy="goFastCustomer")
	private Set<GoFastItem> goFastItems;*/

    public GoFastCustomer() {
    }

	 
	public Integer getGfcId() {
		return gfcId;
	}


	public void setGfcId(Integer gfcId) {
		this.gfcId = gfcId;
	}


	public String getGfcDetail() {
		return this.gfcDetail;
	}

	public void setGfcDetail(String gfcDetail) {
		this.gfcDetail = gfcDetail;
	}

	public String getGfcEmail() {
		return this.gfcEmail;
	}

	public void setGfcEmail(String gfcEmail) {
		this.gfcEmail = gfcEmail;
	}

	public String getGfcIconName() {
		return this.gfcIconName;
	}

	public void setGfcIconName(String gfcIconName) {
		this.gfcIconName = gfcIconName;
	}

	public String getGfcIconPath() {
		return this.gfcIconPath;
	}

	public void setGfcIconPath(String gfcIconPath) {
		this.gfcIconPath = gfcIconPath;
	}

	public String getGfcLat() {
		return this.gfcLat;
	}

	public void setGfcLat(String gfcLat) {
		this.gfcLat = gfcLat;
	}

	public String getGfcLong() {
		return this.gfcLong;
	}

	public void setGfcLong(String gfcLong) {
		this.gfcLong = gfcLong;
	}

	public String getGfcName() {
		return this.gfcName;
	}

	public void setGfcName(String gfcName) {
		this.gfcName = gfcName;
	}

	public String getGfcPhone() {
		return this.gfcPhone;
	}

	public void setGfcPhone(String gfcPhone) {
		this.gfcPhone = gfcPhone;
	}

	public String getGfcStatus() {
		return this.gfcStatus;
	}

	public void setGfcStatus(String gfcStatus) {
		this.gfcStatus = gfcStatus;
	}
 
	
}