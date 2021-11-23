package seven;

/**
 * 1. polja
 * 2. konstruktor -> *********
 * 3. funkcije ili metode
 *
 */
public enum Gender {

    FEMALE("Ženski", "Nježniji rod"),
    MALE("Muški", "Grublji rod"),
    UNKNOWN("Nepoznato", "Nepoznat opis")
    ;

    private String name;
    private String description;

    Gender(String n, String d){
        this.name = n;
        this.description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
