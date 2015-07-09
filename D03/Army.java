package army;


public class Army {
   Weapon[] w;
   int max;
   int i=0;
   public int getMax(){
	   return max;
   }
   
   public void setMax(int max){
	   this.max=max;
   }
   
   public Army(int max){
	   w=new Weapon[max];
	   this.max=max;
	   System.out.println("武器最多有"+max+"个！");
   }
   
   public void addWeapon(Weapon wa){
	   if(i<getMax()){
		   System.out.println("武器足够！"+"已增加"+(i+1)+"个武器");
		   w[i]=wa;
		   i++;
	   }
	   else{
		   System.out.println("Warning：武器库已满！不能再加武器！");
	   }
   }
   
   public void attackAll(){
	   System.out.println();
	   System.out.println("所有武器准备战斗！");
	   for(int j=0;j<w.length;j++){
		   System.out.println((j+1)+"号");
		   w[j].move();
	   }
   }
}
