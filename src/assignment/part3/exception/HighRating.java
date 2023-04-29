package assignment.part3.exception;

import Sort.Merge;
import assignment.Film;
import assignment.Film1;

import java.util.ArrayList;
import java.util.List;


public class HighRating {
    public static List<Film1> getHighRating(Film[] films, int timeLimit) {
        Film1[] films1 = new Film1[films.length];
        for (int i = 0; i < films.length; i++) {
            films1[i] = new Film1(films[i].getFilmID(), films[i].getGenre(),
                    films[i].getDirectorName(), films[i].getTitle(),
                    films[i].getLength(), films[i].getRating());
        }
        Merge.sort(films1);

        float sumLength = 0;
        boolean found = false;
        List<Film1> selectedMovies = new ArrayList<>();
        for (int i = 0; i < films1.length; i++) {
            if (films1[i].getLength() + sumLength <= timeLimit) {
                selectedMovies.add(films1[i]);
                sumLength += films1[i].getLength();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No such film with a length under " + timeLimit);
        }

        return selectedMovies;

    }

}
