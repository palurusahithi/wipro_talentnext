package multithreading_questinons;

class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); 
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted during sleep.");
                }
            }
        }
    }
}

public class Question_5 {

    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();
    }
}
