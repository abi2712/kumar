
import java.util.Scanner;

public class Operation{
    private static int multiplicationIteratif(int a , int b){
        int sum = 0;
        for (int i = 1 ; i <= b ; i++){
            sum = sum + a;
        }
    return sum;
    }

    private static int multiplicationRekursif(int a , int b){
        if (b == 1)
            return (a);
        else
        return (a + multiplicationRekursif(a, b-1));
    }


    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Masukkan a = ");
        int a = reader.nextInt();
        System.out.print("Masukkan b = ");
        int b = reader.nextInt();
        // int a = 2;
        // int b = 6;
        System.out.println("Hasil Iteratif = " + multiplicationIteratif(a , b));
        System.out.println("Hasil Rekursif = " + multiplicationRekursif(a , b));
    }
}