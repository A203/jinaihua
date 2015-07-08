package exercise.demo;

import java.util.Scanner;

public class Demo0002 {
   public static void main(String[] args){
	   Scanner input=new Scanner(System.in);
	   System.out.print("«Î ‰»Î––∫≈:");
       int num=input.nextInt();
       
       for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.println("*");
			}
			System.out.println();
			}
   }
}