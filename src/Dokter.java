class Dokter extends TenagaMedis {
    private String spesialis;
    private double tarifPerPasien;

    public Dokter(String nama, int umur, String idPegawai, String spesialis, double tarifPerPasien){
        super(nama,umur,idPegawai);
        this.spesialis = spesialis;
        setTarifPerPasien(tarifPerPasien);

    }
    public String getSpesialis(){
        return spesialis;
    }
    public double getTarifPerPasien(){
        return tarifPerPasien;
    }
    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }
    public void setTarifPerPasien(double tarifPerPasien){
        if (tarifPerPasien < 0){
            System.err.println("Tarif Tidak Boleh Kurang dari o");
        } else {
            this.tarifPerPasien = tarifPerPasien;
        }
        
    }
    public void tampilkanInfo(){
        System.out.println("===data dokter====");
        System.out.println("Nama" + getNama());
        System.out.println("Umur" + getUmur());
        System.out.println("ID Pegawai" + getIdPegawai());
        System.out.println("Tarif per pasien" + tarifPerPasien);
    }
}

