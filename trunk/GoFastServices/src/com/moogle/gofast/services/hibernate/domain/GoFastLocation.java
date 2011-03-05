package com.moogle.gofast.services.hibernate.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the GO_FAST_LOCATION database table.
 * 
 */
@Entity
@Table(name="GO_FAST_LOCATION")
public class GoFastLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GFL_ID")
	private Integer gflId;

	@Column(name="GFL_DETAIL")
	private String gflDetail;

	@Column(name="GFL_NAME")
	private String gflName;

	/*//bi-directional many-to-one association to GoFastItem
	@OneToMany(mappedBy="goFastLocation")
	private Set<GoFastItem> goFastItems;*/

    public GoFastLocation() {
    }

	 
	public Integer getGflId() {
		return gflId;
	}


	public void setGflId(Integer gflId) {
		this.gflId = gflId;
	}


	public String getGflDetail() {
		return this.gflDetail;
	}

	public void setGflDetail(String gflDetail) {
		this.gflDetail = gflDetail;
	}

	public String getGflName() {
		return this.gflName;
	}

	public void setGflName(String gflName) {
		this.gflName = gflName;
	}

	 
}