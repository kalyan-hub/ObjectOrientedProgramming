
class Shape
{
	public void draw()
	{
		System.out.println("Draw a Rectangle or a cirle");
	}
} 
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("I am the rectangle");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("I am the Circle");
	}
}
class Square extends Rectangle
{
	public void draw()
	{
		System.out.println("I am the square");
	}
}
class main
{
	public static void main(String[] args)
	{
		Shape A = new Shape();
		Shape B = new Rectangle();
		Shape C = new Circle();
		Shape D = new Square();
		A.draw();
		Shape ref;
		ref=D;
		ref.draw();
		ref=A;
		ref.draw();
		ref=B;
		ref.draw();
		ref=C;
		ref.draw();
		
	}
}
