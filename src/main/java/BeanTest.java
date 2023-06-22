import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        Album thriller = new Album(1, "Michael Jackson", "Thriller", 1979, 21.5, "Pop");
        System.out.println(thriller.getArtist());
        System.out.println(thriller.getSales());
        System.out.println(thriller);

        Author brandon = new Author(1, "Brandon", "Booker");

        Quote quote1 = new Quote(1, brandon, "It is what it is.");
        Quote quote2 = new Quote(2, new Author(2, "Jimmy", "Johns"), "We make good sandwiches!");

        System.out.println(quote1);
        System.out.println(quote2);

        ArrayList<Quote> allQuotes = new ArrayList<>();
        allQuotes.add(quote1);
        allQuotes.add(quote2);
        System.out.println(allQuotes);

        for (Quote allQuote : allQuotes) {
            System.out.println(allQuote.getAuthor().getFirstName());
            System.out.println(allQuote.getAuthor().getLastName());
            System.out.println(allQuote.getContent());

        }
    }
}
