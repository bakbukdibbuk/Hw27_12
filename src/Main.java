/**
 * Created by perikl on 27/12/15.
 */
public class Main {
    public static void main(String[] args) {

        Book bk1 = new Book("Война и мир", "Л.Н.Толстой", 456123);
        bk1.displaybook();
        LibraryBook lb1 = new LibraryBook("It", "S.King", 4561234, 110015);
        lb1.displaylibbook();
        PrivateBook pb1 = new PrivateBook("Thinking in Java ", "Bruce Eckel", 100456789, "Zeev Hayat");
        pb1.displayPrivatebook();
        ScienceLibBook slb1 = new ScienceLibBook("Atomic Scala", "Bruce Eckel", 232145662, 1100815, "Programming");
        slb1.displaySienceLibBook();
        ArtLibBook alb1 = new ArtLibBook("Catify to Satisfy", "Jackson Galaxy", 9854556, 5462320, "Design");
        alb1.displayArtLibBook();



    }
}