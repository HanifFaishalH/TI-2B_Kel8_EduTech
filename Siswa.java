public class Siswa extends Pengguna {
    private String nama;
    private int kelas;
    private String kursus;

    public void setNamaSiswa(String newNama) {
        nama = newNama;
    }
    public void setKelasSiswa(int kelas) {
        this.kelas = kelas;
    }
    public void setKursusSiswa(String kursus) {
        this.kursus = kursus;
    }

    public String getNamaSiswa() {
        return nama;
    }
    public int getKelasSiswa() {
        return kelas;
    }
    public String getKursusSiswa() {
        return kursus;
    }

    public void printDataSiswa() {
        System.out.println();
        super.printData();
        System.out.println("Nama Siswa : "+nama);
        System.out.println("Kelas : "+kelas);
        System.out.println("Kursus : "+kursus);
    }
}
