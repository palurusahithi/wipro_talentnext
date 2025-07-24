package multithreading_questinons;

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers between 1 and 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Line break
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers between 1 and 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}

public class Question_4 {

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        try {
            evenThread.join();  
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        oddThread.start();
    }
}
