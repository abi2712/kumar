import java.util.Scanner;
public class Rekursif {
    private static int faktorialIteratif(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

    private static int faktorialRekursif(int n) {
        if (n <= 1) return 1;
        else return n * faktorialRekursif(n - 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = reader.nextInt();
        System.out.println("Faktorial iteratif: " + faktorialIteratif(n));
        System.out.println("Faktorial rekursif: " + faktorialRekursif(n));
        reader.close();
}
}