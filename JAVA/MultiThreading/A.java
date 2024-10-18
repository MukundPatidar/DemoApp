package MultiThreading;

public class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Mukund");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // public void run(){
    // while (true) {
    // System.out.println("Hello");
    // }
    // }
}
