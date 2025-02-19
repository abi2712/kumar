import java.util.ArrayList;
import java.util.List
public class warung {
    private list<Jualan> daftarJualan;
    public Jualan(){
        this.daftarJualan = new ArrayList<>();
    }
    public void addJualan(Jualan baru){
        daftarJualan.add(baru);
    }
    public void viewJualan(){
        System.out.println("---------------------");
        for (Jualan j : daftarJualan){
            j.get.Status();
        }
        System.out.println("----------------------");
    }
    System.out.println("tambah cabe?");
}
