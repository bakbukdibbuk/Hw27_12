/**
 * Created by perikl on 27/12/15.
 */
public class LibraryBook  extends Book{
    private int catnumber;

    public LibraryBook(String title, String author, int id, int catnumber) {
        super(title, author, id);
        this.catnumber = catnumber;
    }

    public int getCatnumber() {
        return catnumber;
    }

    public void setCatnumber(int catnumber) {
        this.catnumber = catnumber;
    }
    public void displaylibbook(){
        super.displaybook();
        System.out.println("Catalog number:" + catnumber + "\n");
    }
}
