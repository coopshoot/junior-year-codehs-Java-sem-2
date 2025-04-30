public class Novel extends Book
{
    
    // Start here!
    private int readingLevel;
    private String genre;
    public Novel(String title, String author, int readingLevel, String genre)
    {
        super(title,author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }
    public int getReadingLevel()
    {
        return readingLevel;
    }
    public void setReadingLevel(int w)
    {
        readingLevel = w;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String r)
    {
        genre = r;
    }
    public String toString()
    {
        return genre + " Novel";
    }
}
