package myPackages;

public class Derived extends Base {
    Derived() {
        System.out.println("derived constructor");
        // class only
        // System.out.println("n_pri = "4 + n_pri);
        System.out.println("n_def = " + n_def);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
