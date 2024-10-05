abstract class Programming {
    public abstract void Developer();

    public abstract void Rank();
}

abstract class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class java extends HTML {
    @Override
    public void Rank() {
        System.out.println("2rd");
    }
}

class Main {
    public static void main(String[] args) {
        Programming h = new java();
        h.Developer();
        h.Rank();
    }
}