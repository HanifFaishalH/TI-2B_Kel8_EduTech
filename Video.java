public class Video extends Konten {
    private String durasi;

    public Video(String judul, String durasi) {
        super(judul);
        this.durasi = durasi;
    }

    public String getDurasi() {
        return durasi;
    }

    @Override
    public void printKonten() {
        System.out.println();
        System.out.println("Judul Video: "+getJudul());
        System.out.println("Durasi: "+durasi);
    }
}
