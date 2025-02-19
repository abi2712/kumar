public class Kombinasi {
    // Fungsi rekursif untuk menghitung C(n, k)
    public static int kombinasi(int n, int k) {
        // Basis kasus
        if (k == 0 || k == n) {
            return 1;
        }
        // Rekurens
        return kombinasi(n - 1, k) + kombinasi(n - 1, k - 1);
    }

    public static void main(String[] args) {
        int n = 5, k = 2; // Contoh input
        System.out.println("C(" + n + ", " + k + ") = " + kombinasi(n, k));
    }
}