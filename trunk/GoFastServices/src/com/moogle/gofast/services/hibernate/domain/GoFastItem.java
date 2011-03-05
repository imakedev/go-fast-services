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
 * The persistent class for the GO_FAST_ITEM database table.
 * 
 */
@Entity
@Table(name="GO_FAST_ITEM")
public class GoFastItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GFI_ID")
	private Integer gfiId;

	@Column(name="GFI_DETAIL")
	private String gfiDetail;

	@Column(name="GFI_DISCOUNT")
	private String gfiDiscount;

	@Column(name="GFI_NAME")
	private String gfiName;

	@Column(name="GFI_STATUS")
	private String gfiStatus;

	//bi-directional many-to-one association to GoFastCustomer
    @ManyToOne
	@JoinColumn(name="GFC_ID")
	private GoFastCustomer goFastCustomer;

	//bi-directional many-to-one association to GoFastCat
    @ManyToOne
	@JoinColumn(name="GFCA_ID")
	private GoFastCat goFastCat;

	/*//bi-directional many-to-one association to GoFastLocation
    @ManyToOne
	@JoinColumn(name="GFL_ID")
	private GoFastLocation goFastLocation;*/

	//bi-directional many-to-one association to GoFastArea
    @ManyToOne
	@JoinColumn(name="GFA_ID")
	private GoFastArea goFastArea;

    public GoFastItem() {
    }

	 

	public Integer getGfiId() {
		return gfiId;
	}



	public void setGfiId(Integer gfiId) {
		this.gfiId = gfiId;
	}



	public String getGfiDetail() {
		return this.gfiDetail;
	}

	public void setGfiDetail(String gfiDetail) {
		this.gfiDetail = gfiDetail;
	}

	public String getGfiDiscount() {
		return this.gfiDiscount;
	}

	public void setGfiDiscount(String gfiDiscount) {
		this.gfiDiscount = gfiDiscount;
	}

	public String getGfiName() {
		return this.gfiName;
	}

	public void setGfiName(String gfiName) {
		this.gfiName = gfiName;
	}

	public String getGfiStatus() {
		return this.gfiStatus;
	}

	public void setGfiStatus(String gfiStatus) {
		this.gfiStatus = gfiStatus;
	}

	public GoFastCustomer getGoFastCustomer() {
		return this.goFastCustomer;
	}

	public void setGoFastCustomer(GoFastCustomer goFastCustomer) {
		this.goFastCustomer = goFastCustomer;
	}
	
	public GoFastCat getGoFastCat() {
		return this.goFastCat;
	}

	public void setGoFastCat(GoFastCat goFastCat) {
		this.goFastCat = goFastCat;
	}
	
	/*public GoFastLocation getGoFastLocation() {
		return this.goFastLocation;
	}

	public void setGoFastLocation(GoFastLocation goFastLocation) {
		this.goFastLocation = goFastLocation;
	}*/
	
	public GoFastArea getGoFastArea() {
		return this.goFastArea;
	}

	public void setGoFastArea(GoFastArea goFastArea) {
		this.goFastArea = goFastArea;
	}
	
}