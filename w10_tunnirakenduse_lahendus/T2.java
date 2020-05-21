package thrds;

public class T2 extends Thread {

    public void run(){

        for (int i = 10; i >= 0; i--) {
            System.out.println("Thread 2: " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // some day ...
            }
        }
    }
}