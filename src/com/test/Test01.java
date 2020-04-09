package com.test;

/**
 * @Author: rcj
 * @Date: 2020/4/9 22:08
 */
public class Test01 {
    static String year = "2020";
    static String month = "04";

    public static void main(String[] args){
        System.out.println(getString(year,month));
    }

    public static String getString(String year,String month){
        String date = year + month;

        return date;
    }

}
