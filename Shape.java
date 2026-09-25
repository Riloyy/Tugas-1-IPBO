// Induk dari semua bangun datar.
public abstract class Shape {

    public String getColor() {
        return "black";
    }
    public abstract double calculateArea();

    // Secara default memakai nama class-nya.
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
