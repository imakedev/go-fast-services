package com.moogle.gofast.services;

import java.util.List;

import com.moogle.gofast.services.hibernate.domain.GoFastArea;
import com.moogle.gofast.services.hibernate.domain.GoFastCat;
import com.moogle.gofast.services.hibernate.domain.GoFastCustomer;
import com.moogle.gofast.services.hibernate.domain.GoFastItem;
import com.moogle.gofast.services.hibernate.domain.GoFastLocation;
import com.moogle.gofast.utils.Paging;

public interface GoFastService {
	// GO_FAST_LOCATION
	public GoFastLocation findGoFastLocationById(Integer gflId);
	public int updateGoFastLocation(GoFastLocation goFastLocation);
	public Integer saveGoFastLocation(GoFastLocation transientInstance);
	public void deleteGoFastLocation(GoFastLocation persistentInstance);
	public List searchGoFastLocation(GoFastLocation persistentInstance,Paging paging);
	
	// GO_FAST_CAT
	public GoFastCat findGoFastCatById(Integer gfcaId);
	public int updateGoFastCat(GoFastCat goFastCat);
	public Integer saveGoFastCat(GoFastCat transientInstance);
	public void deleteGoFastCat(GoFastCat persistentInstance);
	public List searchGoFastCat(GoFastCat persistentInstance,Paging paging);
	
	// GO_FAST_AREA
	public GoFastArea findGoFastAreaById(Integer gfaId);
	public int updateGoFastArea(GoFastArea goFastArea);
	public Integer saveGoFastArea(GoFastArea transientInstance);
	public void deleteGoFastArea(GoFastArea persistentInstance);
	public List searchGoFastArea(GoFastArea persistentInstance,Paging paging);
	
	// GO_FAST_CUSTOMER
	public GoFastCustomer findGoFastCustomerById(Integer gfaId);
	public int updateGoFastCustomer(GoFastCustomer goFastCustomer);
	public Integer saveGoFastCustomer(GoFastCustomer transientInstance);
	public void deleteGoFastCustomer(GoFastCustomer persistentInstance);
	public List searchGoFastCustomer(GoFastCustomer persistentInstance,Paging paging);
	
	// GO_FAST_ITEM
	public GoFastItem findGoFastItemById(Integer gfaId);
	public int updateGoFastItem(GoFastItem goFastItem);
	public Integer saveGoFastItem(GoFastItem transientInstance);
	public void deleteGoFastItem(GoFastItem persistentInstance);
	public List searchGoFastItem(GoFastItem persistentInstance,Paging paging);
}
