class Even implements Runnable{
public void run()
{
	int i;
	for(i=1;i<20;i++)
	{
		System.out.println("i");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}	
}
class odd implements Runnable{
	public void run()
	{
	int i;
	for(i=1;i<20;i+2)
	{
		System.out.println(i)
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
}
class Multithread
{
	public static void main(String[] args)
	{
		Even e = new Even;
		Thread t= new Thread(a);
		odd o = new odd;
		Thread t1 = new Thread(o);
		t.start();
		t2.start();
	}
}