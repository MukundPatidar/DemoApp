package MultiThreading;

class msg {
	public void show(String name) { // home
		;
		;
		;
		;
		;
		; // 100 LOC
		synchronized (this) {
			for (int i = 1; i <= 3; i++) {
				System.out.println("How are you" + name);
			}
		}
		;
		;
		;
		;
		;
		; // 100 LOC
	}
}

class OurThread extends Thread {
	msg m;
	String name;

	OurThread(msg m, String name) {
		this.m = m;
		this.name = name;
	}

	public void run()

	{
		m.show(name);
	}
}

public class SynBlock {
	public static void main(String[] agrs) {
		msg m = new msg();
		OurThread t2 = new OurThread(m, " Mukund");
		OurThread t1 = new OurThread(m, " dilip");
		t1.start();
		t2.start();
	}
}