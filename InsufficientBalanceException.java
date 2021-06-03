import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String s)
	{
		super(s);
	}
}
class Bank
{
	Main m = new Main();
	String acc;
	int bal;
	public void bankacc(String accno,int balance)
	{
		this.acc=accno;
		this.bal=balance;
	}
	public void withdraw(int amt)
	{
		if(amt>bal)
		{
			try{
				m.check(amt);
			}
			catch(InsufficientBalanceException ex)
			{
				System.out.println("Exception Caught");
				System.out.println(ex.getMessage());
			}
		}
		else
		{
			bal=bal-amt;
			System.out.println("Transaction Successful");
		}
	}
}
class Main
{
	public static Bank bk = new Bank();
	public void check(int amount) throws InsufficientBalanceException
	{
		if(amount>bk.bal)
		{
			throw new InsufficientBalanceException("InsufficientBalance");
		}
	}
	public static void main(String[] args){
	int ammt,ba;
	String aacno;
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter Username");
    aacno=sc.nextLine();
    System.out.println("Enter Initial balance");
    ba=sc.nextInt();
    sc.nextLine();
    bk.bankacc(aacno,ba);
	System.out.println("Enter the amount you want to withdraw");
	ammt=sc.nextInt();
	sc.nextLine();
	bk.withdraw(ammt);
	System.out.println("Your Username:"+bk.acc);
	System.out.println("Your current Balance:"+bk.bal);

	}

}
