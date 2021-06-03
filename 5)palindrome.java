import java.util.Scanner;
class palindrome{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		original=sc.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		boolean temp=false;
		System.out.println(original);
		System.out.println(reverse);
		/*for(int i=0;i<length;i++)
		{
		   if(original.charAt(i)==reverse.charAt(i))
		   {
			   temp=true;
		   }
		   else 
		   {
			   temp=false;
			   break;
		   }
		}
		System.out.println(temp);*/
		 if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
		
	}
}
//Alternate Solution
/*public class Palindrome {
    public static void main(String[] args) {
        int num = 11221, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}*/
