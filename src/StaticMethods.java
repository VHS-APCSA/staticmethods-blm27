
public class StaticMethods 
{
	public static double area(double radius)
	{
		double area = (Math.PI)*(Math.pow(radius,2));
		return area;
	}
	public static double coneVolume(double height, double radius)
	{
		double cone = ((1/3)(Math.PI)(radius*radius)(height));
		return cone;
	}
}


