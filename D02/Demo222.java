package ifdemo;

import java.util.Scanner;

public class Demo222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//根据学生的分数，输出学生的成绩等级
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();//输出整数
		if(score>=90)
		{
			System.out.println("等级为A");
		}
		else if(score>=80)
		{
			System.out.println("等级为B");
		}
		else if(score>=70)
		{
			System.out.println("等级为C");
		}
		else if(score>=60)
		{
			System.out.println("等级为D");
		}
		else 
		{
			System.out.println("等级为E");
		}
	}
}
