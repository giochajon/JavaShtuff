
public class ExampleThread implements Runnable{
    public static void main (String[] args){
        System.out.println("w3");
        Thread t = new Thread ();

        t.start ();

        System.out.println("w2");
        t.run();
        System.out.println("w1");
    }
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }



    }