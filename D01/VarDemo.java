package com.geminno.demo;

public class VarDemo {
   static int number;//���������
   int age;
   public void varDefine()
   {
	   //int 1a;//���������������ֿ�ͷ
	   //int a@;//�������Ϸ��ַ�
	   int $123;//�Ϸ���ʶ��
	   int productPrice;
	   //int if;//��ʶ�������ǹؼ���
	   int i=5;
	   int j;
	   j=5;
	   int i1,j1=5;
	   int k=i+j;
	   //����final����
	   final float PI=3.14159f;
	   //PI=3.14f;//final����ֻ�ܱ��޸�һ��
   }
   public static void main(String[] args){
	   //TODO Auto-generated method stub
	   //���ʷ�ʽ��������������
	   //System.out.println(VarDemo.number);
	   //��Ա�������ʣ������.������
	   VarDemo demo=new VarDemo();
	   System.out.println(demo.age);
	   //���ʷ�ʽ������.������
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
