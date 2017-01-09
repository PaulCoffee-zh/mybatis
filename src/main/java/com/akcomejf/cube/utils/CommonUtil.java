package com.akcomejf.cube.utils;

import org.apache.commons.lang3.StringUtils;

public class CommonUtil {
	
	public static final String SOURCE="0";  // 网站
	/**
	 * 处理用户身份证显示
	 * @param idCard
	 * @return
	 */
	public static String dealIdCard(String idCard){
		if(StringUtils.isBlank(idCard)) return "";
		StringBuffer idCardNew = new StringBuffer();
		idCardNew.append(idCard.substring(0, 5));
		idCardNew.append("***********");
		idCardNew.append(idCard.substring(16));
		return idCardNew.toString();
	}

	/**
	 * 处理卡号后四位
	 * @param bankNo
	 * @return
	 */
	public static String dealBankNo(String bankNo){
		if(StringUtils.isBlank(bankNo)) return "";
		return StringUtils.substring(bankNo, bankNo.length() - 4);
	}

	/**
	 * 处理姓名
	 * @param realName
	 * @return
	 */
	public static String dealRealName(String realName){
		if(StringUtils.isBlank(realName)) return "";
		String firstName = StringUtils.substring(realName, 0, 1);
		//String lastName =  StringUtils.substring(realName, realName.length() - 1);
		return firstName + "**";
	}

	/**
	 * 处理手机
	 * @param mobile
	 * @return
	 */
	public static String dealMobile(String mobile){
		if(StringUtils.isBlank(mobile)) return "";
		StringBuffer mobileNew = new StringBuffer();
		mobileNew.append(mobile.substring(0, 3));
		mobileNew.append("*****");
		mobileNew.append(mobile.substring(8));
		return mobileNew.toString();
	}
}
