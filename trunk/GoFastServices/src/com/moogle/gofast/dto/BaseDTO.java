package com.moogle.gofast.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;



 

@XStreamAlias("baseDTO")
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("serviceName")
	private String serviceName;
  
	@XStreamAlias("orderBy")
	private String orderBy;
	
	@XStreamAlias("paging")
	private Paging Paging;
	
	
	public Paging getPaging() {
		return Paging;
	}

	public void setPaging(Paging paging) {
		Paging = paging;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	 
	
}
