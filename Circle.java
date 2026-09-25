// Lingkaran, anak dari Shape.
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Rumus luas lingkaran: phi x r x r
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
