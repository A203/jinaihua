package com.geminno.demo;

public class BaseDataType {
   public static void main(String[] args){
	   //TODO Auto-generated method study
	   //byte类型数据位数以及最大最小值
	   System.out.println("基本类型：byte二进制位数"+Byte.SIZE);
	   System.out.println("基本类型：byte最大值"+Byte.MAX_VALUE);
	   System.out.println("基本类型：byte最小值"+Byte.MIN_VALUE);
	   //float类型数据位数以及最大最小值
	   System.out.println("基本类型：float二进制位数"+Float.SIZE);
	   System.out.println("基本类型：float最大值"+Float.MAX_VALUE);
	   System.out.println("基本类型：float最小值"+Float.MIN_VALUE);
	   //byte类型数据默值
	   byte b=50;
	   //byte b1=130;//指出byte类型暗示的数据范围
	   //float变量数值
	   float f=10.0f;
	   double d=20.0;
	   //char类型数据默值
	   char ch1='A';
	   char ch2=65;
	   System.out.println(ch1+""+ch2);
	   char ch3='中';
   }
}
