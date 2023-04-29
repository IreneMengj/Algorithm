package assignment.part3.exception;

import assignment.Film;

import java.util.*;


public class MovieSelection {

    public static List<Film> selectMovies(Film[] movies, int maxLength) {
        /**

         A method that selects a list of movies based on the maximum length of time allowed

         @param movies an array of Film objects to choose from

         @param maxLength the maximum length of time allowed

         @return a list of selected Film objects
         */
        int[][] dp = new int[movies.length + 1][maxLength + 1];
        for (int i = 1; i <= movies.length; i++) {
            for (int j = 1; j <= maxLength; j++) {
                int length = (int) (movies[i-1].getLength()*10);
                int rating = (int) (movies[i - 1].getRating() * 10);
                if (length <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - length] + rating);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // reverse and find the movie you chose
        List<Film> selectedMovies = new ArrayList<>();
        int i = movies.length;
        int j = maxLength;
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                selectedMovies.add(movies[i - 1]);
                j -= movies[i-1].getLength();
            }
            i--;
        }
        Collections.reverse(selectedMovies);
        return selectedMovies;
    }
}

