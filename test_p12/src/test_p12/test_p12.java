package test_p12;

public class test_p12 {
	public static void main(String[]args)
	{
		Car car1;
		car1= new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showCar();
	}
}
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
	
	void showCar()
	{
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}
