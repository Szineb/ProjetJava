
import java.net.URL;
import java.time.LocalDate;

public class Article {
    private String title;
    private String description;
    private LocalDate  datePublication;
    private String rss;
    private String author;
    private URL link;
    private int inter;
    //Constructeur
    public Article(String title,String description,LocalDate datePublication,String rss,String author, URL link,int iner){
    this.title = title;
    this.description = description;
    this.datePublication = datePublication;
    this.rss = rss;
    this.author = author;
    this.link = link;
    this.inter = inter;
    }
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public String getRss() {
        return rss;
    }

    public void setRss(String rss) {
        this.rss = rss;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public int getInter() {
        return inter;
    }

    public void setInter(int inter) {
        this.inter = inter;
    }
    
}
