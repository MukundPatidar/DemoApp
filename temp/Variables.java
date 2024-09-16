public class Variables {
    static int b = 20;
    int c = 30;

    public static void main(String[] args) {
        int a = 10;
        Variables ref = new Variables();

        System.out.println(a);
        System.out.println(Variables.b);
        System.out.println(ref.c);
    }
}
