import java.util.Scanner;
import java.util.ArrayList;

public class EduTech {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Kursus> kursusList = new ArrayList<>();
        ArrayList<Siswa> siswaList = new ArrayList<>();
        ArrayList<Pembayaran> pembayaranList = new ArrayList<>();

        while (true) {
            
            System.out.println("=== SISTEM KURSUS EDUTECH===");
            System.out.println("1. Masuk sebagai Pengajar");
            System.out.println("2. Masuk sebagai Siswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2): ");
            int pilihan = Integer.parseInt(scanner.nextLine());
    
            if (pilihan == 1) {
                // Mode Pengajar
                System.out.println("\n=== DAFTAR PENGAJAR ===");
                Pengajar pengajar = new Pengajar();
                System.out.print("Masukkan nama pengajar: ");
                pengajar.setNamaGuru(scanner.nextLine());
                System.out.print("Masukkan email pengajar: ");
                pengajar.setEmail(scanner.nextLine());
                System.out.print("Masukkan mata pelajaran pengajar: ");
                pengajar.setMatkulGuru(scanner.nextLine());
                System.out.print("Masukkan ID pengajar: ");
                pengajar.setID(scanner.nextLine());
    
                // Membuat Kursus
                System.out.println("\n=== DAFTAR KURSUS ===");
                System.out.print("Masukkan nama kursus: ");
                String namaKursus = scanner.nextLine();
                Kursus kursus = new Kursus(namaKursus, pengajar);
                kursusList.add(kursus);
    
                // Menambahkan Konten ke Kursus
                System.out.println("\n=== TAMBAH KONTEN ===");
                System.out.print("Berapa banyak konten yang ingin ditambahkan? ");
                int jumlahKonten = Integer.parseInt(scanner.nextLine());
    
                for (int i = 0; i < jumlahKonten; i++) {
                    System.out.println("\nPilih tipe konten ke-" + (i + 1));
                    System.out.println("1. Video");
                    System.out.println("2. Artikel");
                    System.out.println("3. Kuis");
                    System.out.print("Pilihan: ");
                    int pilihanKonten = Integer.parseInt(scanner.nextLine());
    
                    switch (pilihanKonten) {
                        case 1:
                            System.out.print("Masukkan judul video: ");
                            String judulVideo = scanner.nextLine();
                            System.out.print("Masukkan durasi video: ");
                            String durasi = scanner.nextLine();
                            kursus.tambahKonten(new Video(judulVideo, durasi));
                            break;
                        case 2:
                            System.out.print("Masukkan judul artikel: ");
                            String judulArtikel = scanner.nextLine();
                            System.out.print("Masukkan penulis artikel: ");
                            String penulis = scanner.nextLine();
                            kursus.tambahKonten(new Artikel(judulArtikel, penulis));
                            break;
                        case 3:
                            System.out.print("Masukkan judul kuis: ");
                            String judulKuis = scanner.nextLine();
                            System.out.print("Masukkan jumlah soal: ");
                            int jumlahSoal = Integer.parseInt(scanner.nextLine());
                            kursus.tambahKonten(new Kuis(judulKuis, jumlahSoal));
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            i--; // Mengulang input untuk konten yang salah
                    }
                }
    
                // Menampilkan detail kursus
                System.out.println("\n=== DETAIL KURSUS ===");
                kursus.printKursus();
    
            } else if (pilihan == 2) {
                // Mode Siswa
                System.out.println("\n=== DAFTAR SISWA ===");
                Siswa siswa = new Siswa();
                System.out.print("Masukkan nama siswa: ");
                siswa.setNamaSiswa(scanner.nextLine());
                System.out.print("Masukkan email siswa: ");
                siswa.setEmail(scanner.nextLine());
                System.out.print("Masukkan ID siswa: ");
                siswa.setID(scanner.nextLine());
                System.out.print("Masukkan kelas siswa: ");
                int kelas = Integer.parseInt(scanner.nextLine());
                siswa.setKelasSiswa(kelas);
                siswaList.add(siswa);
    
                // Daftar Kursus Tersedia
                if (kursusList.isEmpty()) {
                    System.out.println("Tidak ada kursus yang tersedia saat ini.");
                } else {
                    System.out.println("\n=== PILIH KURSUS ===");
                    for (int i = 0; i < kursusList.size(); i++) {
                        System.out.println((i + 1) + ". " + kursusList.get(i).getNamaKursus());
                    }
                    System.out.print("Pilih kursus (masukkan nomor): ");
                    int pilihanKursus = Integer.parseInt(scanner.nextLine()) - 1;
                    Kursus kursus = kursusList.get(pilihanKursus);
                    kursus.daftarSiswa(siswa);
    
                    // Melakukan Pembayaran
                    System.out.print("Masukkan jumlah pembayaran untuk kursus: ");
                    double jumlahPembayaran = Double.parseDouble(scanner.nextLine());
                    Pembayaran pembayaran = new Pembayaran(siswa, kursus, jumlahPembayaran);
                    pembayaranList.add(pembayaran);
                    pembayaran.printPembayaran();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan Sistem Manajemen Kursus EduTech. Selamat tinggal!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        

        // Pengajar pengajar1 = new Pengajar();
        
        // pengajar1.setID("T-1");
        // pengajar1.setEmail("budionocihuy@example.com");
        // pengajar1.setNamaGuru("Budiono Siregar");
        // pengajar1.setMatkulGuru("Matematika");
        // pengajar1.printDataGuru();
        
        // Kursus kursus1 = new Kursus("Matematika", pengajar1);
        // kursus1.tambahKonten(new Video("Materi Matematika Kelas 12: Integral - Penjelasan dan Latihan Soal", "10:34"));
        // kursus1.tambahKonten(new Artikel("Belajar Integral", "Anthony Mudryk"));
        // kursus1.tambahKonten(new Kuis("Kuis Integral", 10));
        
        // Siswa siswa1 = new Siswa();
        // siswa1.setID("S-1");
        // siswa1.setEmail("mamanobeng@example.com");
        // siswa1.setNamaSiswa("Maman Rahadi");
        // siswa1.setKelasSiswa(12);
        // siswa1.setKursusSiswa("Matematika");

        // Siswa siswa2 = new Siswa();
        // siswa2.setID("S-2");
        // siswa2.setEmail("kikibakpao77@example.com");
        // siswa2.setNamaSiswa("Kiki Makino");
        // siswa2.setKelasSiswa(12);
        // siswa2.setKursusSiswa("Matematika");
        
        // kursus1.daftarSiswa(siswa1);
        // kursus1.daftarSiswa(siswa2);

        // kursus1.printKursus();

        // Pembayaran pembayaran1 = new Pembayaran(siswa1, kursus1, 50000);
        // Pembayaran pembayaran2 = new Pembayaran(siswa2, kursus1, 50000);

        // pembayaran1.printPembayaran();
        // pembayaran2.printPembayaran();
        
    }
}