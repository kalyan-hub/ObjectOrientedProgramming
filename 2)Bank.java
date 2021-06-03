import java.util.Scanner;
class Bank
{
	protected String accNo;
	protected double bal;
	public void bankacc(String accno,double inibal)
	{
		accNo=accno;
		bal=inibal;
		System.out.println("Registration Successfull");
	}
	public void deposit(double amount)
	{
		double newbal=bal+amount;
		bal=newbal;
		System.out.println("Amount deposited");
	}
	public void withdraw(double amount)
	{
		double newbal=bal-amount;
		bal=newbal;
		System.out.println("Amount withdrawed");
	}
	public String getacc()
	{
		return accNo;
	}
	public double getbal()
	{
		return bal;
	}
	public void transfer(Bank dest,double amount)
	{
		 dest.deposit(amount);
		 this.withdraw(amount);
	}
	public double interest(int T)
	{
		double rate=0.2;
		double si=(bal*T*rate);
		return si;
	}
	public double interest(int T,double rate)
	{
		rate=rate/100;
		double si=(bal*T*rate);
		return si;
	}
}
class Main
{
public static void main(String[] args)
{
	Bank first = new Bank();
	first.bankacc("1234",2000);
	double k = first.interest(2);
	double k2= first.interest(2,10);
	System.out.println("k: "+ k +" k2: "+k2);
	
	/*Scanner sc=new Scanner(System.in);
	int i=1;
	int choice=1;
	Bank accounts[]=new Bank[6];
	while(choice!=7)
	{
		System.out.println("Enter Your choice");
		choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
			case 1:{
				if(i<10)
				{
				System.out.println("Enter Your accNo");
				String accNo=sc.nextLine();
				System.out.println("Enter inital balance");
				double initailbal=sc.nextDouble();
				sc.nextLine();
				Bank accounts[i] = new Bank();
				accounts[i].bankacc(accNo,initailbal);
				i=i+1;
				}
				else
				{
					System.out.println("No further registrations can be made");
				}
			}
			case 2:{
				System.out.println("Enter amount to be deposited");
				double amt=sc.nextDouble();
				System.out.println("Enter your acc no.");
				String accNo=sc.nextLine();
			    int temp;
				for(int j=1;j<6;j++)
				{
					if(accounts[j].accNo==accNo)
					{
						accounts[j].deposit(amt);
					    temp=j;
						break;
					}
					else if(j==5)
					{
						System.out.println("Invalid acc");
					}
				}
				
				
				
			}
		}
	}*/
	//Many things are to be done in this program , which is the sole 
	//reason I am leaving this question as I have my java exams tomorrow
	//and I need to do a lot of programs
}
}
