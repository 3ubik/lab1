package bsu.rfe.java.group8.lab1.Zubtsov.var6b;

public class Apple extends Food {

private String size;
	
	public Apple(String size) 
	{
		super("�������");
		this.size = size;
		
	}
	
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public String toString()
	{
		
		return super.toString()+" ������� '" +size.toUpperCase()+"'";
	}
	public boolean equals(Object arg0) 
	{
		if (super.equals(arg0)) 
		{
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
		} else
		return false;
		}
	public double calculatecalories() {
		if(size.equals("�������"))
			{
				calories=50.0;
				
			}
		else if(size.equals("�������"))
		{
			calories=60.0;
			
		}
		else if(size.equals("�����"))
		{
			calories=70.0;
			
		}
		else return 0.0;
		return calories;
	}
	public void consume() 
	{
		System.out.println(this+"�����������, �������� ��������:  "+calculatecalories());

	}

}
