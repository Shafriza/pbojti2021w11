package TUGAS;
public class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;
    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama,jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
//  fungsi ini adalah implementasi dari interface Herbivora
    @Override
    public void displayMakan() {
        System.out.println("Jenis : "+jenisK);
        System.out.println("Makanan : "+makananK);
    }
//  fungsi ini adalah implementasi abstract method dari class Binatang
    @Override
    public void displayBinatang() {
        System.out.println("Nama : "+nama);
        System.out.println("Jumlah Kaki : "+jmlKaki);
    }
//  fungsi ini digunakan untuk menampilkan seluruh data pada class ini  
    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("Suara : "+suara);
        System.out.println("Warna Bulu : "+warnaBulu+"\n");
    }
}
