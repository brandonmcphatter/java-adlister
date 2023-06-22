import java.io.Serializable;

public class Album implements Serializable {

    private int id;
    private String artist;
    private String name;
    private int release_date;
    private double sales;
    private String genre;

    public Album() {
    }

    public Album(int id, String artist, String name, int release_date, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public double getSales() {
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

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", release_date=" + release_date +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                '}';
    }
}
