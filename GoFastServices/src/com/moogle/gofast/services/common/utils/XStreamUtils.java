package com.moogle.gofast.services.common.utils;

import com.thoughtworks.xstream.XStream;

public class XStreamUtils {
	private static com.thoughtworks.xstream.XStream xstream =  new XStream(new com.thoughtworks.xstream.io.xml.Dom4JDriver());

	static{
		Class[] classes = new Class[7];
		 
		classes[0] =com.moogle.gofast.dto.ResultDTO.class;
		classes[1] =com.moogle.gofast.dto.ResultMessage.class;
		classes[2] =com.moogle.gofast.dto.GoFastAreaDTO.class;
		classes[3] =com.moogle.gofast.dto.GoFastCatDTO.class;
		classes[4] =com.moogle.gofast.dto.GoFastCustomerDTO.class;
		classes[5] =com.moogle.gofast.dto.GoFastItemDTO.class;
		classes[6] =com.moogle.gofast.dto.GoFastLocationDTO.class;
		
		 
		xstream.processAnnotations(classes);
	} 
	public static com.thoughtworks.xstream.XStream getXstream() {
		return xstream;
	}
}
