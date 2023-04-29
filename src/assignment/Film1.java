package assignment;

public class Film1 extends Film implements Comparable<Object> {

        public Film1(int filmID, String genre, String directorName, String title, float length, float rating) {
            super(filmID, genre, directorName, title, length, rating);
        }

        @Override
        public int compareTo(Object o) {
            //my second last digit is 3, so I need to sort on column 5.
            Film1 film = (Film1) o;
            if (this.getRating() > film.getRating()) {
                return -1;
            } else if (this.getRating() < film.getRating()) {
                return 1;
            } else {
                //If two items have the same value sort based on column 1.
                if (this.getLength() > film.getLength()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        }

    }

