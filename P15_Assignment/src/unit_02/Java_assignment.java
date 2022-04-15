package unit_02;

public class Java_assignment {

	public static void main(String[] args) 
	{
		Java_assignment1 obj = new Java_assignment1();
		obj.abstractClassCall();
		obj.overloadingAndOverrinding();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();

	}


}

class Java_assignment1
{
	void abstractClassCall()
	{
		Sample3 obj = new Sample3();
		obj.run();
	}
	
	void overloadingAndOverrinding()
	{
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	
	void accessProtectionInJava()
	{
		Sample3 obj = new Sample3();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	
	void interfaceImplementation()
	{
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
	}
}

abstract class Sample2
{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData()
	{
		System.out.println("Inside Sample2 ParentClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	public void display()
	{
		System.out.println("This is a display ,method inside abstract class Sample2!");
		
	}
	
	abstract public void run();
}

class Sample3 extends Sample2 implements A3 , B3

{
	public void display()
	{
		System.out.println("Inside childClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	
	public void display1()
	{
		System.out.println("This is a display1 method in child class Sample3 from Interface");
		
	}
	
	public void display2()
	{
		System.out.println("This is a display2 method in child class Sample3 from Interface");
		
	}
	
	public void run()
	{
		System.out.println("This is a run method from abstrct class Sample2!");
		
	}
	
	public void run(int x)
	{
		System.out.println("This is a run overloaded method in Sample3!");
		
	}
	
	public void run(int x , int y)
	{
		System.out.println("This is a run overloaded method in Sample3!");
		
	}
	
}
	interface A3
	{
		public void display1();
	}
	
	interface B3
	{
		public void display2();
	}


