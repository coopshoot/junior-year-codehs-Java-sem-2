public class Book
{

    // Start here!
    private String title;
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String x)
    {
        title = x;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String w)
    {
        author = w;
    }
    public String toString()
    {
        return "Book: " + title;
    }
}
