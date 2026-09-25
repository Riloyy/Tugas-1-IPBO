// Class utama untuk menjalankan program.
// Membuat object Circle, Square, Triangle lalu menampilkan luasnya.
public class Main {
    public static void main(String[] args) {
        // Pakai tipe Shape (induk) untuk menampung semua anaknya.
        Shape circle = new Circle(7);
        Shape square = new Square(5);
        Shape triangle = new Triangle(6, 4);

        Shape[] shapes = { circle, square, triangle };

        System.out.println("=== Program Penghitung Luas Bangun Datar ===");
        for (Shape shape : shapes) {
            System.out.printf("%-8s | Color: %-4s | Area: %.2f%n",
                    shape.getName(),
                    shape.getColor(),
                    shape.calculateArea());
        }
        System.out.println("============================================");
    }
}
