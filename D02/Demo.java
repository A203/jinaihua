package booleandemo;

public class Demo {
	public static void main(String[] args) {
	for(int num=2;num<=50;num++){
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+"\t");
			}
		}
     }
}
