package multithreading_questinons;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}

public class Question_3 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-MAX");
        MyThread t2 = new MyThread("Thread-NORM");
        MyThread t3 = new MyThread("Thread-MIN");

       
        t1.setPriority(Thread.MAX_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MIN_PRIORITY);   

        
        t1.start();
        t2.start();
        t3.start();
    }
}
