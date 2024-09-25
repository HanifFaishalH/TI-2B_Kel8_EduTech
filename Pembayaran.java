public class Pembayaran {
    private Siswa siswa;
    private Kursus kursus;
    private double jumlah;

    public Pembayaran(Siswa siswa, Kursus kursus, double jumlah) {
        this.siswa = siswa;
        this.kursus = kursus;
        this.jumlah = jumlah;
    }

    public void printPembayaran() {
        System.out.println();
        System.out.println("List pembayaran Kursus");
        System.out.println("========================");
        System.out.println("Peserta: "+siswa.getNamaSiswa());
        System.out.println("Kursus: "+kursus.getNamaKursus());
        System.out.println("Jumlah pembayaran: "+jumlah);
    }
}
