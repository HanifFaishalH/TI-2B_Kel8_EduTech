

public class Artikel extends Konten{
    private String penulis;

    public Artikel(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public void printKonten() {
        System.out.println();
        System.out.println("Judul artikel : "+getJudul());
        System.out.println("Penulis : "+getPenulis());
    }
}
