package army;

public class Weapon2 {
   class Tank extends Weapon{
	   public void attack(){
		   System.out.println("Tank is attacking now!");
	   }
	   public void move(){
		   System.out.println("Tank is moving now!");
	   }
   class Fighter extends Weapon{
	   public void attack(){
		   System.out.println("Fighter is attacking now!");
	   }
	   public void move(){
		   System.out.println("Fighter is moving now!");
	   }
   }
   
   class Warship extends Weapon{
	   public void attack(){
		   System.out.println("WarShip is attacking now");
	   }
	   public void move(){
		   System.out.println("WarShip is moving now!");
	   }
     }
   }
}