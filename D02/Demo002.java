package dowhiledemo;

public class Demo002 {
	public static void main(String[] args){
		   int i=1;
		   do{
			   if(i%5==0){
				   System.out.println(i+"\t");
			   }
		       i++;  
		   }
			   while(i<99);
	   }
}
