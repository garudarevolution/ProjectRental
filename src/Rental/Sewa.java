package Rental;

/**
 *
 * @author Serildawn
 */
public class Sewa 
{
    
    private int id_sewa;
    private int id_pelanggan;
    private String mulai_sewa;
    private int lama_sewa;
    private String jenis_alat;
    private int jumlah_alat;
    private int harga_sewa;
    
    public Sewa(){
        
    }
    
    public int getIdSewa() {
        return id_sewa;
    }

    public void setIdSewa(int id) {
        this.id_sewa = id;
    }
    
    public int getIdPelanggan() {
        return id_pelanggan;
    }

    public void setIdPelanggan(int id) {
        this.id_pelanggan = id;
    }

    public String getMulaiSewa() {
        return mulai_sewa;
    }

    public void setMulaiSewa(String sewa) {
        this.mulai_sewa = sewa;
    }

    public int getHargaSewa() {
        return harga_sewa;
    }

    public void setHargaSewa(int hargasewa) {
        this.harga_sewa = hargasewa;
    }
    
    public int getLamaSewa() {
        return lama_sewa;
    }

    public void setLamaSewa(int lama) {
        this.lama_sewa = lama;
    }
    
    public String getJenisAlat() {
        return jenis_alat;
    }

    public void seJenisAlat(String alat) {
        this.jenis_alat = alat;
    }
    
     public int getJumlahAlat() {
        return jumlah_alat;
    }

    public void setJumlahAlat(int jmlh) {
        this.jumlah_alat = jmlh;
    }
}
