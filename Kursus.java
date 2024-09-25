import java.util.ArrayList;

public class Kursus {
    private String namaKursus;
    private Pengajar instruktur;
    private ArrayList<Konten> kontenList;
    private ArrayList<Siswa> SiswaList;

    public Kursus(String namaKursus, Pengajar instruktur) {
        this.namaKursus = namaKursus;
        this.instruktur = instruktur;
        this.kontenList = new ArrayList<>();
        this.SiswaList = new ArrayList<>();
    }

    public String getNamaKursus() {
        return namaKursus;
    }

    public Pengajar getPengajar() {
        return instruktur;
    }

    public void tambahKonten(Konten konten) {
        kontenList.add(konten);
    }

    public void daftarSiswa(Siswa siswa) {
        SiswaList.add(siswa);
    }

    public void printKursus() {
        System.out.println();
        System.out.println("NamaKursus : "+namaKursus);
        instruktur.printDataGuru();
        System.out.println("Konten Kursus: ");
        for (Konten konten : kontenList) {
            konten.printKonten();
        }
        System.out.println();
        System.out.println("Peserta yang terdaftar: ");
        for (Siswa siswa : SiswaList) {
            siswa.printDataSiswa();
        }
    }
}

