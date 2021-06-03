import java.util.Scanner;
class person
{
	String name;
	private String password;
	int age;
	
	public void pers()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ,age and Password");
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		password=sc.nextLine();
		
		System.out.println("Name : "+name+"\nage : "+age+"\nPassword : "+password);
	}
}
class student extends person{
	String name,Division;
	int Roll;
	public void stu()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ,roll and Divison");
		name=sc.nextLine();
		System.out.println(super.name);
		Roll=sc.nextInt();
		sc.nextLine();
		Division=sc.nextLine();
		
		System.out.println("Name : "+name+"\nage : "+Roll+"\nDiviosion : "+Division);
		System.out.print("Student name : "+name+"\nPerson name : "+super.name);
	}
}
class Main{
	public static void main(String[] args)
	{
		person p = new person();
		student k = new student();
		p.pers();
		k.stu();

		
	}
}
/*import java.util.*;
class Person
{
	public String Name;
	public int age;
	private String pass;
	public void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ,age and Password");
		Name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		pass=sc.nextLine();
		
		
	}
	public void Display()
	{
		System.out.println("Name : "+Name+"\nage : "+age+"\npassword : "+ pass);
	}
}
class Student extends Person
{
	String Name,Div;
	int roll;
	
	//this.Name = super.Name;
	public void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DIV and ROLL");
		Div = sc.nextLine();
		roll = sc.nextInt();
	}
	public void read()
	{
		super.readData();
		this.readData();
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("Class : "+ Div+"\nRoll : "+roll);
	}
	
	
}
class Main5
{
	public static void main(String[] a)
	{
		Student s = new Student();
		s.read();
		s.Display();
	}
}*/
//alternate Solution by @Shreyas Khadapkar
