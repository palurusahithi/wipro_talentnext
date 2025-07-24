package multithreading_questinons;

import java.util.Random;

public class Question_2 implements Runnable {

    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();

   
    public void run() {
        while (true) {
            int index = random.nextInt(colours.length);
            String colour = colours[index];
            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red found! Stopping display.");
                break;
            }

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Question_2 colourDisplay = new Question_2();
        Thread thread = new Thread(colourDisplay);
        thread.start();
    }
}