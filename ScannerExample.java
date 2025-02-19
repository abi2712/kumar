nextLine() //Digunakan untuk membaca input berupa string (satu baris penuh).
next() //Membaca satu kata hingga ada spasi atau delimiter lainnya.
nexInt() //Membaca input berupa bilangan bulat.
nextDouble() //Membaca input berupa bilangan desimal (double).
nextBoolean() //Membaca input berupa nilai boolean (true/false).
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);

        // Menggunakan nextLine() untuk membaca input satu baris penuh (string)
        System.out.print("Masukkan nama lengkap Anda: ");
        String namaLengkap = scanner.nextLine();

        // Menggunakan next() untuk membaca satu kata (string)
        System.out.print("Masukkan nama panggilan Anda: ");
        String namaPanggilan = scanner.next();

        // Menggunakan nextInt() untuk membaca input berupa bilangan bulat
        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        // Menggunakan nextDouble() untuk membaca input berupa bilangan desimal
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggiBadan = scanner.nextDouble();

        // Menggunakan nextBoolean() untuk membaca input berupa boolean (true/false)
        System.out.print("Apakah Anda suka olahraga? (true/false): ");
        boolean sukaOlahraga = scanner.nextBoolean();

        // Menampilkan hasil input
        System.out.println("\n--- Data yang Anda masukkan ---");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Nama Panggilan: " + namaPanggilan);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " meter");
        System.out.println("Suka Olahraga: " + (sukaOlahraga ? "Ya" : "Tidak"));

        // Menutup scanner
        scanner.close();
    }
}
