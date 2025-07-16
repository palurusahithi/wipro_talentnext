package abstraction_questions;

import java.util.Random;

abstract class Compartment {
	    abstract String notice();
	}

class FirstClass extends Compartment {
	    String notice() {
	        return "First Class Compartment";
	    }
	}

	class Ladies extends Compartment {
	    String notice() {
	        return "Ladies Compartment";
	    }
	}

	class General extends Compartment {
	    String notice() {
	        return "General Compartment";
	    }
	}

	class Luggage extends Compartment {
	    String notice() {
	        return "Luggage Compartment";
	    }
	}

	
	public class Question_1 {
	
	    public static void main(String[] args) {
	        Compartment[] compartments = new Compartment[10];
	        Random random = new Random();

	        for (int i = 0; i < 10; i++) {
	            int type = random.nextInt(4) + 1;

	            if (type == 1)
	                compartments[i] = new FirstClass();
	            else if (type == 2)
	                compartments[i] = new Ladies();
	            else if (type == 3)
	                compartments[i] = new General();
	            else
	                compartments[i] = new Luggage();
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }
	    }
	}


