package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int height= 175;
        int weight = 60;
        Scanner scan = new Scanner(System.in);//从键盘接收数据
        System.out.println("next方式接收：");// next方式接收字符串
        // 判断是否还有输入
        while (scan.hasNextLine())
        {
            String sex = scan.nextLine();
            System.out.println("输入的数据为：" + sex);
            if(sex.equals("female"))
//                if(sex.equals("female"))
            {
                System.out.println("计算女员工体重指标：" + sex);
                System.out.println("女员工身高" +  height + "cm");
                System.out.println("女员工体重：" +  weight + "kg");
                if(weight - (height-110) > 5)
                {
                    System.out.println("女员工体重超标 " + (weight - (height-110)) + " kg");
                }
                else if((height-110) - weight > 5)
                {
                    System.out.println("女员工体重偏瘦 " + ((height-110) - weight) + " kg");
                }
                else
                {
                    System.out.println("女员工体重正常！");
                }
            }
            else if(sex.equals("male"))
            {
                System.out.println("计算男员工体重指标：" + sex);
                System.out.println("男员工身高" +  height + "cm");
                System.out.println("男员工体重：" +  weight + "kg");
                if(weight - (height-105) > 5)
                {
                    System.out.println("男员工体重超标 " + (weight - (height-110)) + " kg");
                }
                else if((height-105) - weight > 5)
                {
                    System.out.println("男员工体重偏瘦 " + ((height-110) - weight) + " kg");
                }
                else
                {
                    System.out.println("计男员工体重正常！");
                }
            }
            else if(sex.equals("quit"))
            {
                scan.close();
                return;
            }
        }
        scan.close();
    }
}
