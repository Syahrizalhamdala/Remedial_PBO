class Perawat extends TenagaMedis {
    private String shiftKerja;
    private int jumlahPasien;

    public Perawat(String nama, int umur, String idPegawai, String shiftKerja, int jumlahPasien){
        super(nama, umur, idPegawai);
        this.shiftKerja = shiftKerja;
        this.jumlahPasien = jumlahPasien;
    }
    public String getShiftKerja(){
        return shiftKerja;
    }
    public int getJumlahPasien(){
        return jumlahPasien;
    }
    public void setShiftKerja(String shiftKerja){
        this.shiftKerja = shiftKerja;
    }
    public void setJumlahPasien(int jumlahPasien){
        this.jumlahPasien = jumlahPasien;
    }
    public void tampilkanInfo(){
        System.out.println("===data perawat====");
        System.out.println("Nama" + getNama());
        System.out.println("Umur" + getUmur());
        System.out.println("ID Pegawai" + getIdPegawai());
        System.out.println("Shift kerja" + shiftKerja);
        System.out.println("jumlah pasien" + jumlahPasien);

}
}
