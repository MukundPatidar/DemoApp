package myPackages;

public class SamePackage {
	SamePackage() {
		Base b = new Base();
		System.out.println("same package constructor");
		// class only
		// System.out.println("n_pri = " + b.n_pri);
		System.out.println("n_def = " + b.n_def);
		System.out.println("n_pro = " + b.n_pro);
		System.out.println("n_pub = " + b.n_pub);
	}
}
