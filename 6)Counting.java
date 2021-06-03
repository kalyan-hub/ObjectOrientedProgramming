import java.util.Scanner;
public class Counting{
	public static void main(String[] args)
	{
		String k;
		Scanner sc = new Scanner(System.in);
		k=sc.nextLine();
		int n=k.length();
		int  i,m=0,a=0;
		for(i=0;i<n;i++)
		{
			if(k.charAt(i)=='a' ||k.charAt(i)=='A' || k.charAt(i)=='e' || k.charAt(i)=='E' ||k.charAt(i)=='i' || k.charAt(i)=='I' ||k.charAt(i)=='o' || k.charAt(i)=='O' ||k.charAt(i)=='u' || k.charAt(i)=='U')
			{
				a++;	
			}
			else
			{
				m++;
			}
		}
		System.out.println("Vowels : "+a+"Consonants : "+m );
	}
}
//Dev
