package six;

/**
 *  Klasa može imati:
 *  <li> 1. polja ili atributi
 *       1.1 nestatička polja .... movie1, movie2....instance ili varijable ili primjerke
 *       1.2 statička polja
 *  </li>
 *  <li>
 *      2. konstruktor  - instancu
 *  </li>
 *  <li>3. funkcije ili metode
 *      3.1 instance
 *      3.2 statičke
 *  </li>
 *  <li>
 *      4. inner clasee
 *  </li>
 */
public class Movie {
    //Movie
    private static int counter = 0;
    //movie1, movie2, movie3
    private String title;
    private String director;
    private int review;

    public Movie(){
        System.out.println("KOnstruktor se pozvao...");
        counter++;
    }

    public Movie(String title){
        this.title = title;
        System.out.println("Konstruktor sa jednim parametrom se pozvao");
        counter++;
    }

    public Movie(String title, String director){
       this.title = title;
       this.director = director;
    }

    public Movie(String title, int review){
        this.title = title;
        this.review = review;
    }


    public Movie(int review, String director){
        this.director = director;
        this.review = review;
    }

    public Movie(String title, String director, int review){
        this.title = title;
        this.director = director;
        this.review = review;
    }


    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        if(review>=1 && review<=10){
            this.review = review;
        }
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Movie setDirector(String director) {
        this.director = director;
        return this;
    }



    public static void print(){
        System.out.println("Counter: " + counter);
    }

    @Override
    public String toString() {
        return "FILM: " + title;
    }
}
