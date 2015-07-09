package army;

public class Testarmy {
   public static void main(String[] args){
	   Army a=new Army(3);
	   a.addWeapon(new Tank());
	   a.addWeapon(new Fighter());
	   a.addWeapon(new WarShip());
	   a.addWeapon(new WarShip());
   }
}
