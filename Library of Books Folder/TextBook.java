public class TextBook extends Book
{

    // Start here!
    private int edition;
    private boolean isEbook;
    public TextBook(String title, String author, int edition, boolean isEbook)
    {
        super(title,author);
        this.edition = edition;
        this.isEbook = isEbook;
    }
    public int getEdition()
    {
        return edition;
    }
    public void setEdition(int x)
    {
        edition = x;
    }
    public boolean isEbook()
    {
        return isEbook;
    }
    public void setEbook(boolean w)
    {
        isEbook = w;
    }
    public String toString()
    {
        return "Textbook edition # " + edition;
    }

