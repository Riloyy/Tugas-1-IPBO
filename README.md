# Tugas 1 IPBO

Nama: Rilo Pamuji
NIM: 2311510461
Mata Kuliah: Implementasi Pemrograman Berbasis Objek (IPBO)

## Penjelasan Singkat

- `Shape` = class induk, bentuk umum. Tidak bisa dibuat object langsung karena abstract.
- `Circle` = lingkaran, turunan dari Shape. Rumus luas: phi x r x r.
- `Square` = persegi, turunan dari Shape. Rumus luas: sisi x sisi.
- `Triangle` = segitiga, turunan dari Shape. Rumus luas: 0.5 x alas x tinggi.
- `Main` = class utama untuk menjalankan program. Membuat 1 object Circle, 1 object Square, 1 object Triangle, lalu menampilkan luasnya.

## Struktur Folder

```
tugas-1-ipbo/
├── README.md
├── .gitignore
├── Shape.java
├── Circle.java
├── Square.java
├── Triangle.java
└── Main.java
```

## Cara Menjalankan

1. Install JDK (minimal Java 8 ke atas).
2. Buka terminal di folder ini.
3. Compile semua file:
   ```
   javac *.java
   ```
4. Jalankan program:
   ```
   java Main
   ```

## Contoh Output

```
=== Program Penghitung Luas Bangun Datar ===
Circle   | Color: black | Area: 153.94
Square   | Color: black | Area: 25.00
Triangle | Color: black | Area: 12.00
============================================
```