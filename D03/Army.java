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
	   System.out.println("���������"+max+"����");
   }
   
   public void addWeapon(Weapon wa){
	   if(i<getMax()){
		   System.out.println("�����㹻��"+"������"+(i+1)+"������");
		   w[i]=wa;
		   i++;
	   }
	   else{
		   System.out.println("Warning�������������������ټ�������");
	   }
   }
   
   public void attackAll(){
	   System.out.println();
	   System.out.println("��������׼��ս����");
	   for(int j=0;j<w.length;j++){
		   System.out.println((j+1)+"��");
		   w[j].move();
	   }
   }
}
