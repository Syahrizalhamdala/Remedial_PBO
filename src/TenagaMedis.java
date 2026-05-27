
public class TenagaMedis {
    private String nama;
    private int umur;
    private String idPegawai;

    public TenagaMedis(String nama, int umur, String idPegawai){
        this.nama = nama;
        setUmur(umur);
        this.idPegawai = idPegawai;
    }

    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public String getIdPegawai(){
        return idPegawai;
    }
    public void setNama(String nama){
        this.nama = nama;

    }
    public void setUmur(int umur){
        if (umur < 0){
            System.err.println("Umur tidak boleh negatif");
        } else {
            this.umur = umur;
        }

    }
    public void setIdPegawai(String idPegawai){
        this.idPegawai = idPegawai;
    }
    
    
}
