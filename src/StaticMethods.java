
public class StaticMethods 
{
	public static double area(double radius)
	{
		double area = (Math.PI)*(Math.pow(radius,2));
		return area;
	}
	public static double coneVolume(double height, double radius)
	{
		double cone = ((1.0/3.0)*(Math.PI)*(radius*radius)*(height));
		return cone;
	}
	public static double temperature(double fahrenheit)
	{
		double celcius = (fahrenheit - 32)*(5.0/9.0);
		return celcius;
	}
	public static int reverse(int number)
	{
		int result = 0;
		int rem;
		while (number > 0) 
		{
			rem = number % 10;
			number = number / 10;
			result = result * 10 + rem;
		}
		return result;
	}
	
}


