package bsu.rfe.java.group8.lab1.Zubtsov.var6b;

public class Coffe extends Food 
{
	private String aroma;
	
	public Coffe(String aroma) 
	{
		super("Кофе");
		this.aroma = aroma;
		
	}
	
	public String getAroma() 
	{
		return aroma;
	}
	public void setAroma(String aroma) 
	{
		this.aroma = aroma;
	}
	public String toString()
	{
		
		return super.toString()+" аромата '" +aroma.toUpperCase()+"'";
	}
	public boolean equals(Object arg0) 
	{
		if (super.equals(arg0)) 
		{
		if (!(arg0 instanceof Coffe)) return false;
		return aroma.equals(((Coffe)arg0).aroma);
		} else
		return false;
		}
	public double calculatecalories() {
		if(aroma.equals("насыщенный"))
			{
				calories=1.0;
				
			}
		else if(aroma.equals("восточный"))
		{
			calories=6.0;
			
		}
		else if(aroma.equals("горький"))
		{
			calories=5.0;
			
		}
		else return 0.0;
		return calories;
	}
	public void consume() 
	{
		System.out.println(this+"употреблено, получено каллорий:  "+calculatecalories());

	}

	
	

	
	

	
	
}
