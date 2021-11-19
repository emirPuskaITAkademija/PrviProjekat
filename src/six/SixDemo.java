package six;

/**
 * MODIFIKATORI VIDLJIVOSTI:
 * <li>1. public</li>
 * <li>2. paketno privatni</li>
 * <li>3. protected</li>
 * <li>4. private</li>
 * <p>
 * OUTER -> public, paketno privatna
 * <p>
 * Klasa može imati:
 * <li>1. polja, properties, attributes ili member varijable klase</li>
 * </p>
 */

public class SixDemo {
    public static void main(String[] args) {


        Movie.print();


        Movie movie1 = new Movie();
        movie1.setDirector("Tarantino");
        movie1.setTitle("Django");
        movie1.setReview(9);
        //DIREKTOR
        System.out.println(movie1.getDirector());//Tarantino
        movie1.print();

        int review1 = movie1.getReview();

        Movie movie2 = new Movie();
        movie2.setDirector("Steven Spielberg");
        movie2.setTitle("E.T");
        movie2.setReview(88);

        System.out.println(movie2.getDirector());//Steven Spielberg
        Movie.print();//      2
        movie2.print();  //      2

        Movie movie3 = new Movie("Ničija zemlja");
        System.out.println(movie3.getTitle());//Ničija zemlja

        Movie.print();
        Movie.print();

        Movie movie = new Movie("Invisible Guest", "Pedro", 10);

    }

}
