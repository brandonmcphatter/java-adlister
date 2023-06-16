import java.io.Serializable;

public class Album implements Serializable {

    private String artist;
    private String name;
    private Integer release_date;
    private Integer sales;
    private String genre;

    public Album() {
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public Integer getRelease_date() {
        return release_date;
    }

    public Integer getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_date(Integer release_date) {
        this.release_date = release_date;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
