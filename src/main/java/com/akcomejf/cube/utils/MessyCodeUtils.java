package com.akcomejf.cube.utils;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

/**
 * 乱码处理
 * @author wn
 *
 */
public class MessyCodeUtils {

	/**
	 * 处理下载中文名乱码
	 * @param request
	 * @param fileName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encode(HttpServletRequest request, String fileName) throws UnsupportedEncodingException {
		//为了解决中文名称乱码问题
		    String agent = request.getHeader("USER-AGENT");  
		    if (null != agent && -1 != agent.indexOf("MSIE") || null != agent  
		            && -1 != agent.indexOf("Trident")) {
		    	// IE浏览器 
		        String name = java.net.URLEncoder.encode(fileName, "UTF8");  
		        fileName = name;  
		    } else{
		    	fileName=new String(fileName.getBytes("UTF-8"),"iso-8859-1");
		    }
		return fileName;
	}
}
