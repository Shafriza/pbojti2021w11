
package interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi {
    public PascaSarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71"); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
    public void kuliahDiKampus() {
        super.kuliahDikampus();
    }
    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
