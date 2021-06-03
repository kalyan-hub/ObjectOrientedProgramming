import java.util.Scanner;
class NoVotingMinorException extends Exception
{
     public NoVotingMinorException(String s)
     {
         super(s);
     }
}
class Main
{
    public void check(int age) throws NoVotingMinorException
    {
        if(age<18)
        {
            throw new  NoVotingMinorException("Not good age");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter age");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
       Main a = new Main();
        try{
            a.check(age);
        }
        catch(NoVotingMinorException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
