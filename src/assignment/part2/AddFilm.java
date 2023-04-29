package assignment.part2;

import assignment.Film;

import java.util.Arrays;
import java.util.Scanner;

//Part 2 Defensive Programming and Exception Handling:question 1 and 2
public class AddFilm {
    public static void add(Film[] films) {
        float length;
        float rating;
        //input film details from outside
        Scanner sc = new Scanner(System.in);
        int filmID;
        System.out.print("Please enter the film title: ");
        String title = sc.nextLine();
        System.out.print("Please enter the film genre: ");
        String genre = sc.nextLine();
        System.out.print("Please enter the film director name: ");
        String directorName = sc.nextLine();
        System.out.print("Please enter the film rating: ");
        rating = Float.valueOf(sc.nextLine());
        //add film in the array
        //Extend array length

        Film[] newFilms = Arrays.copyOf(films, films.length + 1);
        filmID = newFilms.length;
        String l;

        //Part 2 Question 2 Defensive Programming and Exception Handling
        //Here, I have used a while true loop to catch the exception that occurs when nothing is entered or a string is entered.
        while (true) {
            try {

                System.out.print("Please enter the film length: ");
                l = sc.nextLine();
                boolean hasLetter = false;
                for (int i = 0; i < l.length(); i++) {
                    if (Character.isLetter(l.charAt(i))) {
                        hasLetter = true;
                        break;
                    }
                }
                if (l.isEmpty()) {
                    System.out.println("---------------------------------------");
                    throw new NumberFormatException("Length can not be empty. Please enter a positive number");
                } else if (hasLetter) {
                    System.out.println("---------------------------------------");
                    throw new NumberFormatException("Length can't have letters! Please enter a positive number");
                } else {
                    length = Float.valueOf(l);
                    if (length < 0) {
                        System.out.println("---------------------------------------");
                        throw new InvalidInputException("Length cannot be negative.Please correct this: ");
                    }
                    break;
                }

            } catch (InvalidInputException e) {
                System.out.println(e.toString());
//                System.out.print("Please enter the film length: ");
//                l = sc.nextLine();
//                length = Float.valueOf(l);

            } catch (NumberFormatException e) {
                System.out.println(e.toString());
//                System.out.print("Please enter the film length: ");
//                l = sc.nextLine();
//                length = Float.valueOf(l);
            }

        }
        Film film = new Film(filmID, title, genre, directorName, length, rating);
        newFilms[newFilms.length - 1] = film;
        System.out.println(newFilms[newFilms.length - 1]);

    }
}





