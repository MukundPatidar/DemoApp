class Shap {
    void Draw(){
        System.out.println("Drawing Shap");
    }
}

class Triangle extends Shap {
    void Draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectengle extends Shap {
    void Draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Temp {
    public static void main(String[] args) {
        // Shap s = new Shap();
        // s.Draw();

        Shap s;

        Triangle t = new Triangle();
        s = t;
        s.Draw();

        Rectengle r = new Rectengle();
        s = r;
        s.Draw();
    }
}