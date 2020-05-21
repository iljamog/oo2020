package thrds;

public class Threads {

    public static void main(String[] args) {        

        Thread t1 = new T1();
        Thread t2 = new T2();
        Thread t3 = new T3();
        Thread t4 = new T4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        

    }
}





