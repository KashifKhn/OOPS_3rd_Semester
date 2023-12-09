public class Main {
    public static void main(String[] args) {
        Movie movie1 = new DramaMovie("PG-13", "D123", "The Godfather");
        Movie movie2 = new ActionMovie("PG-13", "A123", "The Avengers");
        Movie movie3 = new ComedyMovie("PG-13", "C123", "The Hangover");

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println();
        System.out.println("Late Fee for " + movie1.getMovieTitle() + " is $" + movie1.calcLateFees(3));
        System.out.println("Late Fee for " + movie2.getMovieTitle() + " is $" + movie2.calcLateFees(3));
        System.out.println("Late Fee for " + movie3.getMovieTitle() + " is $" + movie3.calcLateFees(3));


    }
}