public class Konten {
    private String judul;

    public Konten(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void printKonten() {
        System.out.println();
        System.out.println("Judul konten : "+judul);
    }
}
