package person;

public class Person1 {
   String name;
   int age;
   String address;
   
   /*
   //�޲�Ĭ�Ϲ��췽��
   Person1(){
	   System.out.println("Person1��Ĭ�Ϲ��췽��������...");
   }
   */
   
   //�вι��췽��
   Person1(String n,int a,String add){
	   name=n;
	   age=a;
	   address=add;
   }
   //���ҽ���
   void introduce(){
	   System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ�����"+address);
   }
   
   public static void main(String[] args){
	   /*Person1 person=new Person1();//ʵ����һ��person����
	   person.name="����";
	   person.age=20;
	   person.address="USA";
	   */
	   Person1 person=new Person1("Jim",30,"����");
	   person.introduce();
   }
}
//��û�й��췽��ʱ��ϵͳ���Զ�����һ��Ĭ�Ϲ��췽��

//���췽����һ�ֱȽ�����ķ���
//û�з������ͣ�����������ͬ��

//�в����Ĺ��췽��
