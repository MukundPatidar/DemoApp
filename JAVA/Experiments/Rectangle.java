package Experiments;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);

        System.out.println("Rectangle 1 dimensions:");
        rect1.displayDimensions();

        System.out.println("Rectangle 2 dimensions:");
        rect2.displayDimensions();
    }
}