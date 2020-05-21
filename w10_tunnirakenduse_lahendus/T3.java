package thrds;

public class T3 extends Thread {

    public void run(){
        char c;

        for(c = 'a'; c <= 'k'; ++c){

            System.out.println("Thread 3: " + c);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // some day ...
            }
        }
    }
}