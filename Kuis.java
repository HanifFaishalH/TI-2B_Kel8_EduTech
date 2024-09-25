public class Kuis extends Konten {
    private int jumlahSoal;

    public Kuis(String judul, int jumlahSoal) {
        super(judul);
        this.jumlahSoal = jumlahSoal;
    }

    public int getJumlahSoal() {
        return jumlahSoal;
    }

    @Override
    public void printKonten() {
        System.out.println();
        System.out.println("Judul Kuis: "+getJudul());
        System.out.println("Jumlah soal "+getJumlahSoal());
    }
}
