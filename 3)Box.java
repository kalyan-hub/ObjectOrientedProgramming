import java.util.Scanner;
class Box
{
	int Height,Width,Length;
	Box(int H,int W,int L)
	{
		this.Height=H;
		this.Length=L;
		this.Width=W;
		System.out.println("Height :"+Height+"\nWidht :"+Width+"\nLength :"+Length);
	}
	Box(int side)
	{
		this.Height=side;
		this.Length=side;
		this.Width=side;
		System.out.println("Height :"+Height+"\nWidht :"+Width+"\nLength :"+Length);
	}
	Box()
	{
		System.out.println("No objects sppecified");
	}
	void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides:");
		this.Height=sc.nextInt();
		this.Width=sc.nextInt();
		this.Length=sc.nextInt();
	}
	void volume()
	{
		int volume=this.Height*this.Length*this.Width;
		System.out.printf("volume:"+volume);	
	}
}

class Main
{
	public static void main(String[] args)
	{
		Box b1 = new Box(2,3,4);
		Box b2 = new Box(2);
		Box b3 = new Box();
		b1.volume();
		b2.volume();
	}
}