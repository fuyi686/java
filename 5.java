package com.company;

//package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JComboBox colorList = null;  //创建界面上的元素

    //设置界面
    public Main() {
        Container c = this.getContentPane();   //获取内容面板
        c.setLayout(new FlowLayout());    //内容面板设置布局策略
        c.setBackground(Color.red);     //设置内容面板背景色
        this.setTitle("Color");    //设置标题
        this.setBounds(600, 100, 300, 350);     //设置窗体初始位置和大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置点击窗体右上角“关闭”按钮时的动作：JFrame.EXIT_ON_CLOSE代表退出程序

        //设置颜色名称，用于构造颜色的下拉列表
        String[] all_clolor = new String[]{"red", "blue", "yellow"};
        colorList = new JComboBox(all_clolor);
        c.add(colorList);   //添加下拉列表至内容面板

        colorList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = colorList.getSelectedIndex();
                System.out.println(index);
                switch (index) {
                    case 0:
                        c.setBackground(Color.red);
                        break;
                    case 1:
                        c.setBackground(Color.blue);
                        break;
                    case 2:
                        c.setBackground(Color.yellow);
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);//创建窗体对象，并设置窗体可见！默认窗体是不可见的
    }
}
