// Segitiga, anak dari Shape.
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Rumus luas segitiga: 0.5 x alas x tinggi
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
