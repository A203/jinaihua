package ifdemo;

import java.util.Scanner;

public class Demo222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����ѧ���ķ��������ѧ���ĳɼ��ȼ�
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();//�������
		if(score>=90)
		{
			System.out.println("�ȼ�ΪA");
		}
		else if(score>=80)
		{
			System.out.println("�ȼ�ΪB");
		}
		else if(score>=70)
		{
			System.out.println("�ȼ�ΪC");
		}
		else if(score>=60)
		{
			System.out.println("�ȼ�ΪD");
		}
		else 
		{
			System.out.println("�ȼ�ΪE");
		}
	}
}