package com.geminno.demo;

public class VarDemo {
   static int number;//定义类变量
   int age;
   public void varDefine()
   {
	   //int 1a;//变量名不能以数字开头
	   //int a@;//包含不合法字符
	   int $123;//合法标识符
	   int productPrice;
	   //int if;//标识符不能是关键字
	   int i=5;
	   int j;
	   j=5;
	   int i1,j1=5;
	   int k=i+j;
	   //定义final变量
	   final float PI=3.14159f;
	   //PI=3.14f;//final变量只能被修改一次
   }
   public static void main(String[] args){
	   //TODO Auto-generated method stub
	   //访问方式：类名，属性码
	   //System.out.println(VarDemo.number);
	   //成员变量访问：类对象.属性名
	   VarDemo demo=new VarDemo();
	   System.out.println(demo.age);
	   //访问方式：对象.属性名
	   VarDemo demo1=new VarDemo();
	   demo1.show();
	   VarDemo demo2=new VarDemo();
	   demo2.show();
   }
   public void show(){
	   number++;
	   System.out.println(number);
   }
}
