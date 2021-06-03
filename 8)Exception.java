import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String s)
	{
		super(s);
	}
}
class Main{
	public void check(int balance,int amount) throws InsufficientBalanceException
	{
		if(amount>balance)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int bal,amount;
			System.out.println("Enter the balance");
			bal=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the amount you want to withdraw");
			amount=sc.nextInt();
			Main m = new Main();
			try
			{
				m.check(bal,amount);
			}
			catch(InsufficientBalanceException ex)
			{
				System.out.println("Caught the exception");
                System.out.println(ex.getMessage());
			}
			
		}
	}
