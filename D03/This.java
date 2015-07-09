package thiS;

public class This {
   public static void main(String[] args){
	   Person person=new Person("Jim",20,"USA");
	   person.introduce();
   }
}

class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//this指当前实例对象，”我”   点预防相当于“的“
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);//
		this.address=address;
	}
	
	void hello(){
		System.out.println("hello...");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
	}
}

