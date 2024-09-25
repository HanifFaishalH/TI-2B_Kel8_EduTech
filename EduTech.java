public class EduTech {
    public static void main(String[] args) {
        Pengajar pengajar1 = new Pengajar();
        
        pengajar1.setID("T-1");
        pengajar1.setEmail("budionocihuy@example.com");
        pengajar1.setNamaGuru("Budiono Siregar");
        pengajar1.setMatkulGuru("Matematika");
        pengajar1.printDataGuru();
        
        Kursus kursus1 = new Kursus("Matematika", pengajar1);
        kursus1.tambahKonten(new Video("Materi Matematika Kelas 12: Integral - Penjelasan dan Latihan Soal", "10:34"));
        kursus1.tambahKonten(new Artikel("Belajar Integral", "Anthony Mudryk"));
        kursus1.tambahKonten(new Kuis("Kuis Integral", 10));
        
        Siswa siswa1 = new Siswa();
        siswa1.setID("S-1");
        siswa1.setEmail("mamanobeng@example.com");
        siswa1.setNamaSiswa("Maman Rahadi");
        siswa1.setKelasSiswa(12);
        siswa1.setKursusSiswa("Matematika");

        Siswa siswa2 = new Siswa();
        siswa2.setID("S-2");
        siswa2.setEmail("kikibakpao77@example.com");
        siswa2.setNamaSiswa("Kiki Makino");
        siswa2.setKelasSiswa(12);
        siswa2.setKursusSiswa("Matematika");
        
        kursus1.daftarSiswa(siswa1);
        kursus1.daftarSiswa(siswa2);

        kursus1.printKursus();

        Pembayaran pembayaran1 = new Pembayaran(siswa1, kursus1, 50000);
        Pembayaran pembayaran2 = new Pembayaran(siswa2, kursus1, 50000);

        pembayaran1.printPembayaran();
        pembayaran2.printPembayaran();
    }
}