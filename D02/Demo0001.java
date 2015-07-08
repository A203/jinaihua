package exercise.demo;

public class Demo0001 {
   public static void main(String[] args){
	   int c[]={8,5,7,4};
		int temp=0;
		for(int i=c.length-1;i>0;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					}
					   for(int i1=0;i1<c.length;i1++)
					{
						System.out.println(c[i1]);
					}
			}
		}
	}
}
