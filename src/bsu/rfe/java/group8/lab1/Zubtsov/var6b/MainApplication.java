package bsu.rfe.java.group8.lab1.Zubtsov.var6b;
import java.util.Arrays;

public class MainApplication {
	public static void main(String[] stroka)
	{
		Food[] breakfast=new Food[20];
		int i=0;
		boolean v1,v2;
		v1=false;
		v2=false;
		for(String arg:stroka)
		{			
				String[] parts = arg.split("/");
				
				
				 if (parts[0].equals("Coffe"))
				 {                               
	                    
	                    breakfast[i] = new Coffe(parts[1]);
	                    
	             } 
				 if (parts[0].equals("Cheese"))
				 {                               
	                    
	                    breakfast[i] = new Cheese();
	                    
	             }
				 if (parts[0].equals("Apple"))
				 {                               
	                    
	                    breakfast[i] = new Apple(parts[1]);
	                    
	             } 
				 
				 i++;
				
				switch (parts[0])
			     {
			     case("-calories"):
			     {
			  	   v1=true;
			  	   break;
			     }
			     case("-sort"):
			     {
			  	   v2=true;
			  	   break;
			     }
	       }
	    
		}
		
		System.out.println("Завтрак: ");
		
		for(Food h:breakfast)
		{
			if(h!=null)
			{	 		        	        
		        	h.consume();       	 	   		        	
		        	
			}
			
		}
		
		if(v1)
		{
			Double caloriescounter=0.0;
			for(Food m:breakfast)
			{
				if(m!=null)
				caloriescounter+=m.calculatecalories();
				
			}
			System.out.println("Общая калорийность завтрака: " + caloriescounter);
		}
		if(v2)
		{
			System.out.println("Завтрак в отсортированном порядке: ");
			Arrays.sort(breakfast,new Foodcomparator());
			for(Food w:breakfast)
			{
				if(w!=null)
				{	 		        	        
			        	w.consume();       	 	   		        	
			        
				}
				
			}
			
			
		}
		
		
		
		
		
		
	
	}
}
	

	
	
	

