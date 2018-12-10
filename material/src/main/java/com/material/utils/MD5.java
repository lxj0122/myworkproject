package com.material.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/3/9
 * Time: 9:33
 */
public class MD5 {
    /**
     * 密码进行MD5加密
     * @param str
     * @return
     */
    public static String  MD5Password(String str){
        StringBuffer stringBuffer=null;
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] byteArr=md.digest();
            if(byteArr==null){
                return "";
            }
            stringBuffer=new StringBuffer("");
            for(int b:byteArr){
                if(b<0){
                    b+=256;
                }
                if(b<16){
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(b));
            }
            if(stringBuffer==null){
                return "";
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="123";
        byte[] bytes=str.getBytes("UTF-8");
        String s=MD5Password("123");
        System.out.println(s+"######"+s.length());
    }
}
