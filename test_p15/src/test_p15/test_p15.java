package test_p15;

public class test_p15 {
	public static void main(String[]args)
	{
		Car car1;
		car1= new Car();
		
		int number=1234;
		double gasoline=20.5;
		
		car1.setNumGas(number,gasoline);
	}
}
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
