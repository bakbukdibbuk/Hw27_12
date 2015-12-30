/**
 * Created by perikl on 27/12/15.
 */
public class ScienceLibBook extends LibraryBook {
    private String science;

    public ScienceLibBook(String title, String author, int id, int catnumber, String science) {
        super(title, author, id, catnumber);
        this.science = science;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }
    public void displaySienceLibBook(){
        super.displaybook();
        System.out.println("Science:" + science + "\n");
    }
}
