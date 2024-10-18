package MultiThreading;

public class A extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }
    }

    // public void run() {
    // String n = Thread.currentThread().getName();
    // try {
    // for (int i = 1; i <= 3; i++) {
    // System.out.println(n);
    // Thread.sleep(3000);
    // }
    // } catch (InterruptedException i) {
    // }
    // }

    // public void run() {
    // String n = Thread.currentThread().getName();
    // for (int i = 0; i < 5; i++) {
    // System.out.println(n);
    // }
    // }

    // public void run() {
    // try {
    // for (int i = 0; i < 10; i++) {
    // System.out.println("Mukund");
    // Thread.sleep(10);
    // }
    // } catch (InterruptedException e) {
    // System.out.println(e);
    // }
    // }

    // public void run(){
    // while (true) {
    // System.out.println("Hello");
    // }
    // }
}
