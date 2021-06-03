class Insrtument
{
	 Insrtument()
	{
		System.out.println("Instrument");
	}
}
class Sitar extends Insrtument
{
	Sitar()
	{
		System.out.println("Sitar");
	}
}
class Harmo extends Sitar
{
	 Harmo()
	{
		System.out.println("Harmo");
	}
}
class Inheritance{
	public static void main(String[] args)
	{
		Harmo obj = new Harmo();
	}
}
