package com.akcomejf.cube.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 获得IP工具
 * Created by SDD on 2016/2/24.
 */
public class IpHelper {

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if(null!=ip &&ip.indexOf(",")>0){
            String[] ipArr = ip.split(",");
            for(int i=0;i<ipArr.length;i++){
                if(!"unknown".equals(ipArr[i])){
                    ip =  ipArr[i];
                    break;
                }
            }
        }
        return ip;
    }
}
