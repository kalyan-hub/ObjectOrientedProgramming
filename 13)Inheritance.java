class Insrtument
{
	public void Display()
	{
		System.out.println("Instrument");
	}
}
class Sitar extends Insrtument
{
	public void Displays()
	{
		System.out.println("Sitar");
	}
}
class Harmo extends Sitar
{
	public void Displayh()
	{
		System.out.println("Sitar");
	}
}
class Inheritance{
	public static void main(String[] args)
	{
		Harmo h = new Harmo();
		h.Displays();
		h.Display();
	}
}
