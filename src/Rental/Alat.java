package Rental;

/**
 *
 * @author Serildawn
 */
public class Alat 
{
    private int id_barang;
    private String jenis_barang;
    private int harga_barang;
    private int jumlah_barang;

    public Alat(){
        
    }
    
    public int getIdBarang() {
        return id_barang;
    }

    public void setIdBarang(int id) {
        this.id_barang = id;
    }

    public String getJenisBarang() {
        return jenis_barang;
    }

    public void setJenisBarang(String nama) {
        this.jenis_barang = nama;
    }

    public int getHargaBarang() {
        return harga_barang;
    }

    public void setHargaBarang(int harga) {
        this.harga_barang = harga;
    }
    
    public int getJumlahBarang() {
        return jumlah_barang;
    }

    public void setJumlahBarang(int jmlh) {
        this.jumlah_barang = jmlh;
    }
}
