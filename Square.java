// Persegi, anak dari Shape.
public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    // Rumus luas persegi: sisi x sisi
    @Override
    public double calculateArea() {
        return side * side;
    }
}
