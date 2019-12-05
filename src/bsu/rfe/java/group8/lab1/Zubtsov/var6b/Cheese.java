package bsu.rfe.java.group8.lab1.Zubtsov.var6b;

public class Cheese extends Food {

	public Cheese() {
		super("—ыр");
		
	}

	
	public void consume() {
		System.out.println(this+" употреблен получено каллорий: "+ calculatecalories());
	}

	
	public double calculatecalories() {
		calories=100.0;
		return calories;
	}

	
	
	}


