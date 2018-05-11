package com.company;

import java.lang.Math;
import java.text.DecimalFormat;

public class Main
{


    public static void main(String[] args)
    {
	// write your code here
//        System.out.println(Math.PI);
//        System.out.println(Math.pow(3,2));
        System.out.println("地球体积："+ 4* Math.PI * Math.pow(7600,3)/3 + "立方英里");
       System.out.println("太阳体积："+ 4* Math.PI * Math.pow(865000,3)/3 + "立方英里");
//       System.out.println("太阳体积与地球体积之比："+ Math.pow((865000/7600),3)+" : 1");
        double ratio = Math.pow((865000/7600),3);
//        DecimalFormat df = new DecimalFormat("0.00");
//        String strRatio = df.format(ratio);//返回的是String类型
//        System.out.println("太阳体积与地球体积之比："+ strRatio +" : 1");

        double ratio= (double)Math.pow((865000/7600),3);
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        String s = df.format(ratio);//返回的是String类型


    }
}
