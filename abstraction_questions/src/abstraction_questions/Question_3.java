package abstraction_questions;

	interface Playable {
	    void play();
	}


	class Veena implements Playable {
	    public void play() {
	        System.out.println("Veena is playing melodiously.");
	    }
	}


	class Saxophone implements Playable {
	    public void play() {
	        System.out.println("Saxophone is playing smoothly.");
	    }
	}


	public class Question_3 {
	    public static void main(String[] args) {
	        
	        Veena veena = new Veena();
	        veena.play();

	       
	        Saxophone sax = new Saxophone();
	        sax.play();

	      
	        Playable p;

	        p = veena;
	        p.play();

	        p = sax;
	        p.play();
	    }
	}



