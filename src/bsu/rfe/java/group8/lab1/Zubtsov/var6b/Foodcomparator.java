package bsu.rfe.java.group8.lab1.Zubtsov.var6b;

import java.util.Comparator;

public class Foodcomparator implements Comparator<Food> {

	
		
		public int compare(Food arg0, Food arg1) {
			if (arg0==null) return 1;
			if (arg1==null) return -1;
			if(arg0.calculatecalories()<arg1.calculatecalories()) {
			return -1;
			};
			if(arg0.calculatecalories()>arg1.calculatecalories()) {
			return 1;
			};
			if(arg0.calculatecalories() == arg1.calculatecalories()) {
			return 0;
			};
			return 0;
			 
			 
			
		
	}

	
	
}
