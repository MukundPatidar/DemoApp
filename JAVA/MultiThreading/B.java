package MultiThreading;

public class B {

    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        // t2.start();
        t3.start();
        try {
            t1.start();
            t2.join();
        } catch (InterruptedException i) {
            System.out.println(i);
        }
    }

    // public static void main(String[] args) {
    // A t1 = new A();
    // A t2 = new A();
    // A t3 = new A();
    // t1.setName("thread 1");
    // t2.setName("thread 2");
    // t3.setName("thread 3");
    // t1.start();
    // t2.start();
    // t3.start();
    // }

    // public static void main(String[] args) {
    // A t1 = new A();
    // A t2 = new A();
    // A t3 = new A();
    // t1.setName("thread 1");
    // t2.setName("thread 2");
    // t3.setName("thread 3");
    // t1.start();
    // t2.start();
    // t3.start();

    // String n = Thread.currentThread().getName();
    // for (int i = 1; i <= 5; i++) {
    // System.out.println(n);
    // }

    // }

    // public static void main(String[] args) {
    // A obj1 = new A();
    // Thread obj = new Thread(obj1);
    // obj.start();
    // try {
    // for (int i = 0; i < 10; i++) {
    // System.out.println("Patidar");
    // Thread.sleep(10);
    // }
    // } catch (InterruptedException e) {
    // System.out.println(e);
    // }
    // }

    // public static void main(String[] args) {
    // A obj = new A();
    // obj.start();
    // while (true) {
    // System.out.println("Mukund");
    // }
    // }
}
