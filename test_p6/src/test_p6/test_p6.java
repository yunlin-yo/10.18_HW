package test_p6;

public class test_p6 {

	public static void main(String[]args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		System.out.println("�����O"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
	}
}
	class Car
	{
		int num;
		double gas;
	}
