package MultiThreading;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Patidar");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // public static void main(String[] args) {
    //     A obj = new A();
    //     obj.start();
    //     while (true) {
    //         System.out.println("Mukund");
    //     }
    // }
}
