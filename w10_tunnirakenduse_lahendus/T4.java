package thrds;

public class T4 extends Thread {

    public void run(){

        char c;

        for(c = 'k'; c <= 'z'; ++c){
            System.out.println("Thread 4: " + c);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // some day ...
            }
        }

        
    }
}