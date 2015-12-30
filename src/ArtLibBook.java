/**
 * Created by perikl on 27/12/15.
 */
public class ArtLibBook extends LibraryBook {
    private String art;

    public ArtLibBook(String title, String author, int id, int catnumber, String art) {
        super(title, author, id, catnumber);
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
    public void displayArtLibBook(){
        super.displaybook();
        System.out.println("Art:" + art + "\n");
    }
}
