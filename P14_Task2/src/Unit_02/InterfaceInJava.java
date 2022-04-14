package Unit_02;

interface Animal
{
	public void animalSound();
	public void run();
}

interface Human
{
	public void humanSound();
	public void run1();
}

public class InterfaceInJava implements Animal
{
	public static void main(String[] args)
	{
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}

	public void animalSound()
	{
		//TODO Auto-generated method stub
	}
	
	public void run()
	{
		//TODO Auto-generated method stub
	}
}

class Species implements Animal , Human
{
	@Override
	public void animalSound()
	{
		System.out.println("We are inside run method");
	}
	
	@Override
	public void run()
	{
		System.out.println("We are inside run method");
	}
	
	@Override
	public void humanSound()
	{
		System.out.println("We are inside humanSide");
	}
	
	@Override
	public void run1()
	{
		System.out.println("We are inside run method");
	}
}

interface A1 
{
	void funcA();
}

interface B1 extends A1
{
	void funcB();
}
class C1 implements B1
{
	public void funcA()
	{
		System.out.println("This is funcA from A1");
	}
	
	public void funcB()
	{
		System.out.println("This is funcB from A2");
	}
}