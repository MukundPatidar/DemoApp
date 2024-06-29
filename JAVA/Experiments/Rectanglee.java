package Experiments;

public class Rectanglee {

    private int width;
    private int height;

    public Rectanglee() {
        width = 0;
        height = 0;
    }

    public Rectanglee(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {

        Rectanglee rect1 = new Rectanglee();
        Rectanglee rect2 = new Rectanglee(5, 10);

        System.out.println("Rectangle 1 dimensions:");
        rect1.displayDimensions();

        System.out.println("Rectangle 2 dimensions:");
        rect2.displayDimensions();
    }
}