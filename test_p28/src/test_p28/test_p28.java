package test_p28;

public class test_p28 {
	public static void main(String[]args)
	{
		Car car1;
		car1= new Car();
		
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.0);
		car2.show();
	}
}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car(int n ,double g)
	{
		this();
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
