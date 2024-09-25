public class Pengajar extends Pengguna {
    private String namaGuru;
    private String matkulGuru;

    public void setNamaGuru(String newNama) {
        namaGuru = newNama;
    }
    public void setMatkulGuru(String newMatkul) {
        matkulGuru = newMatkul;
    }


    public void printDataGuru() {
        System.out.println();
        super.printData();
        System.out.println("Nama Pengajar : "+namaGuru);
        System.out.println("Bio : "+matkulGuru);
    }
}
