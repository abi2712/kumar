public class Jualan {
    String nama;
    long harga;
    int kuantitas;

    public Jualan(){
        this(mieTekTek:8000,mieLurus:1000,mieLebar:2000,mieKriting:1500,gorengan:1000,tambahCabe:500);
    }
    public Jualan(){
        this.nama = nama;
        this.harga = harga;
        this.kuantitas = kuantitas;
    }
    public void getStatus(){
        System.out.println("Jualan status nama: " + nama + "harga: " + harga + "kuantitas: " + kuantitas);
    }
    public void patrol(){
        System.out.println("Jualan");
    }
}
