package bsu.rfe.java.group8.lab1.Zubtsov.var6b;

public class Cheese extends Food {

	public Cheese() {
		super("���");
		
	}

	
	public void consume() {
		System.out.println(this+" ���������� �������� ��������: "+ calculatecalories());
	}

	
	public double calculatecalories() {
		calories=100.0;
		return calories;
	}

	
	
	}


