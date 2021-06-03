import java.util.Scanner;
class MarksOutOfBoundException extends Exception
{
	public MarksOutOfBoundException(String s)
	{
		super(s);
	}
}
class Student
{
	String Name,date;
	int SeatNo,CentreNo,Java,Padc,Ld;
	Main m = new Main();	
	public void readdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		this.Name=sc.nextLine();
		System.out.println("Enter date");
		this.date=sc.nextLine();
		System.out.println("Enter Seat no");
		this.SeatNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Centre No.");
		this.CentreNo=sc.nextInt();
		sc.nextLine();	
		System.out.println("Enter Marks in java ");
		this.Java=sc.nextInt();
		sc.nextLine();
		try{
			m.check(Java);
		}	
		catch(MarksOutOfBoundException ex)
		{
			System.out.println("Caught Exception");
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Enter Marks in padc ");
		this.Padc=sc.nextInt();
		sc.nextLine();	
		try{
			m.check(Padc);
		}	
		catch(MarksOutOfBoundException ex)
		{
			System.out.println("Caught Exception");
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Enter Marks in Ld ");
		this.Ld=sc.nextInt();
		sc.nextLine();	
		try{
			m.check(Ld);
		}	
		catch(MarksOutOfBoundException ex)
		{
			System.out.println("Caught Exception");
			System.out.println(ex.getMessage());
			
		}
		
	}
}
class Main
{
	public void check(int Marks) throws MarksOutOfBoundException
	{
		if(Marks>100 || Marks<0)
		{
			throw new MarksOutOfBoundException("Invalid Marks");
		}
	}
	public static void main(String args[])
	{
		Student st =new Student();
		st.readdata();
	    System.out.println("\nName: "+st.Name+"\ndate :"+st.date+"\nSeatNo :"+st.SeatNo+"\nCentreNo :"+st.CentreNo+"\nJava :"+st.Java+"\nPadc :"+st.Padc+"\nLd :"+st.Ld);
	}
}
