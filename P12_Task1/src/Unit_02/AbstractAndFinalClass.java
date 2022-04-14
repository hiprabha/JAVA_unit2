package Unit_02;

abstract class Bike
{
	int a ;
	
	Bike(){
		System.out.println("Inside Bike Constructor : " + a + "\n");
	}
	
	abstract void run();
	
	void display()
	{
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike
{
	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractAndFinalClass 
{

	public static void main(String[] args) 
	{
		Bike obj = new Honda4();
		obj.display();

	}

}

final class Super
{
	public int data = 30;
	
	void display()
	{
		System.out.println(data);
	}
}


