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
		this.name=name;//thisָ��ǰʵ�����󣬡��ҡ�   ��Ԥ���൱�ڡ��ġ�
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

