package thrds;

public class T1 extends Thread {
        
    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // some day ...
            }
        }
    }
}