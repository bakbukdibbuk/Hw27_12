/**
 * Created by perikl on 27/12/15.
 */
public class PrivateBook extends Book {
    private String owner;

    public PrivateBook(String title, String author, int id, String owner) {
        super(title, author, id);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void displayPrivatebook(){
        super.displaybook();
        System.out.println("Owner:" + owner + "\n");
    }
}
