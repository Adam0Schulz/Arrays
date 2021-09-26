public class Person {
	private String name;
	private int height; //cm
	private double weight;
	
	public Person(String name, int height, double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	public int getHeight()
	{
		return height;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getWeight()
	{
		return weight;
	}
}