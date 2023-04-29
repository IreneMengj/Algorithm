package assignment;

public class Film implements Comparable<Object> {

    private int filmID;
    private String title;
    private String genre;
    private String directorName;
    private float length;
    private float rating;


    // constructor
    public Film(int filmID, String genre, String directorName, String title, float length, float rating) {
        super();
        this.filmID = filmID;
        this.title = title;
        this.genre = genre;
        this.directorName = directorName;
        this.length = length;
        this.rating = rating;
    }

    // setters and getters
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }


    // so the film objects can be compared when sorting/searching
    // NOTE: this will only allow comparisons based on the title of the film
    @Override
    public String toString() {
        return "Film [filmID=" + filmID + ", title=" + title + ", genre=" + genre + ", director name="
                + directorName + ", length=" + length + ", rating="
                + rating + "]";
    }

    // so the film objects can be compared when sorting/searching
// NOTE: this will only allow comparisons based on the title of the film
    @Override
    public int compareTo(Object o) {
        //my second last digit is 3, so I need to sort on column 5.
        Film film = (Film) o;
        if (this.length < film.getLength()) {
            return -1;
        } else if (this.length > film.getLength()) {
            return 1;
        } else {
            //If two items have the same value sort based on column 1.
            return this.filmID - (film.getFilmID());
        }

    }


}
