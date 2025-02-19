import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Jualan jual = new Jualan();
        jual.getStatus();
        jual.getInfo();
        Scanner bacaInput = new Scanner(System.in);
        System.out.println("masukkan nama");
        String nama = bacaInput.nextLine();
        System.out.println("masukkan harga");
        long harga = bacaInput.nextLong();
        System.out.println("masukkan kuantitas");
        int kuantitas = bacaInput.nextInt();
        bacaInput.close();

        Gorengan jual = new Gorengan(harga);
        jual.getStatus();
        jual.tambahCabeRawit();
        System.out.println("masukkan pilihan yang ingin kamu beli(1/2)");

    }
}