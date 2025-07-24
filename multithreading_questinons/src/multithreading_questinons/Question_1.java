package multithreading_questinons;

public class Question_1 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        });
        thread1.setName("Scooby");

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        });
        thread2.setName("Shaggy");

        thread1.start();
        thread2.start();
    }
}