package com.moogle.gofast.services.hibernate.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the GO_FAST_CAT database table.
 * 
 */
@Entity
@Table(name="GO_FAST_CAT")
public class GoFastCat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GFCA_ID")
	private Integer gfcaId;

	@Column(name="GFCA_DETAIL")
	private String gfcaDetail;

	@Column(name="GFCA_ICON_NAME")
	private String gfcaIconName;

	@Column(name="GFCA_ICON_PATH")
	private String gfcaIconPath;

	@Column(name="GFCA_NAME")
	private String gfcaName;
	
	@Column(name="GFCA_LEVEL")
	private Integer gfcaLevel;
	
	@Column(name="GFCA_PARENT")
	private Integer gfcaParent;

	/*//bi-directional many-to-one association to GoFastItem
	@OneToMany(mappedBy="goFastCat")
	private Set<GoFastItem> goFastItems;*/

    public GoFastCat() {
    }

	 
	public Integer getGfcaId() {
		return gfcaId;
	}


	public void setGfcaId(Integer gfcaId) {
		this.gfcaId = gfcaId;
	}


	public String getGfcaDetail() {
		return this.gfcaDetail;
	}

	public void setGfcaDetail(String gfcaDetail) {
		this.gfcaDetail = gfcaDetail;
	}

	public String getGfcaIconName() {
		return this.gfcaIconName;
	}

	public void setGfcaIconName(String gfcaIconName) {
		this.gfcaIconName = gfcaIconName;
	}

	public String getGfcaIconPath() {
		return this.gfcaIconPath;
	}

	public void setGfcaIconPath(String gfcaIconPath) {
		this.gfcaIconPath = gfcaIconPath;
	}

	public String getGfcaName() {
		return this.gfcaName;
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