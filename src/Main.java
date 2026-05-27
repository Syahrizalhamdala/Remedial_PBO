public class Main {
    public static void main(String[] args) {
        Dokter d = new Dokter("aril", 20, "DOO1", "OBYEN", 15000);
        d.tampilkanInfo();
        System.out.println();
        d.setTarifPerPasien(20000);
        d.tampilkanInfo();


        Perawat p = new Perawat("putri",23, "POO1", "MAlAm", 23);
        p.tampilkanInfo();

    }

}
