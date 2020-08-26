package com.qa.practiceprograms;

import org.apache.poi.hslf.record.CString;

public class StringRotation {
    public static void main(String args[])
    {
        String str1 = "GeeksforGeeks";
        //System.out.println(leftrotate(str1, 2));

        String str2 = "GeeksforGeeks";
        System.out.print(str2.length());
        System.out.println(rightrotate(str2, 2));
    }

    private static String rightrotate(String str2, int i) {

        String temp = str2.substring(str2.length()-2);
        return (temp+str2.substring(0,str2.length()-2));

    }

    private static String leftrotate(String str1, int i) {
        return "";
    }


}
