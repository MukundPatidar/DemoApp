package myPackages;

public class Base {
    private int n_pri = 1;
    int n_def = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Base() {
        System.out.println("base constructor");
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_def = " + n_def);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
