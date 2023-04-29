package assignment;

import assignment.part1.sortAlgorithm.Merge;
import assignment.part1.searchAlgorithm.BinarySearch;
import assignment.part1.searchAlgorithm.LinearSearch;
import assignment.part1.sortAlgorithm.BubbleSort;
import assignment.part1.sortAlgorithm.InsertionSort;
import assignment.part1.sortAlgorithm.QuickSort;
import assignment.part1.sortAlgorithm.SelectionSort;
import assignment.part2.AddFilm;
import assignment.part3.exception.HighRating;
import assignment.part3.exception.MovieSelection;

import java.io.File;
import java.util.*;

public class ReadFilmData {

    public static void main(String[] args) throws Exception {
        //parsing and reading the CSV file data into the film (object) array
        // provide the path here...
        String directory = System.getProperty("user.dir");
        Scanner sc = new Scanner(new File("src/assignment/Film.csv"));
        Film[] films = new Film[10000];
        // this will just print the header in CSV file
        sc.nextLine();
        int i = 0;
        String st = "";
        while (sc.hasNextLine())  //returns a boolean value
        {
            st = sc.nextLine();
            String[] data = st.split(",");
            films[i++] = new Film(Integer.parseInt(data[0]), data[1], data[2], data[3], Float.parseFloat(data[4]), Float.parseFloat(data[5]));
        }
        sc.close();

        //Let all sorting algorithms operate on a copy of the 'film' array instead of the original array
        // to avoid affecting the comparison of sorting efficiency.
        Film[] filmsCopy1 = Arrays.copyOf(films,films.length);

        //Part 1 Question 1 Sorting and Searching: Algorithm Analysis: 1
        Merge.sort(filmsCopy1);
        System.out.println(Arrays.toString(filmsCopy1));
        System.out.println("----------------------------------------");


        //Part 1 Question 2 Sorting and Searching: Algorithm Analysis: 2
        int[] recordNO = {10, 100, 1000, 5000, 10000};
        long executionNO = 100L;
        long total = 0L;

        //Part 1 Question 2:run time complexity of Merge sort
        Film[] filmsCopy2 = Arrays.copyOf(films,films.length);
        Merge.mergeRunTime(filmsCopy2,executionNO,recordNO,total);
        System.out.println("----------------------------------------");

        //Part 1 Question 2:run time complexity of Quick sort
        Film[] filmsCopy3 = Arrays.copyOf(films,films.length);
        QuickSort.quickRunTime(filmsCopy3,executionNO,recordNO,total);
        System.out.println("----------------------------------------");

        //Part 1 Question 2:run time complexity of Bubble sort
        Film[] filmsCopy4 = Arrays.copyOf(films,films.length);
        BubbleSort.bubbleRunTime(filmsCopy4,executionNO,recordNO,total);
        System.out.println("----------------------------------------");

        //Part 1 Question 2:run time complexity of Selection sort
        Film[] filmsCopy5 = Arrays.copyOf(films,films.length);
        SelectionSort.selectionRunTime(filmsCopy5,executionNO,recordNO,total);
        System.out.println("----------------------------------------");

        //Part 1 Question 2:run time complexity of Insertion sort
        Film[] filmsCopy6 = Arrays.copyOf(films,films.length);
        InsertionSort.insertionRunTime(filmsCopy6,executionNO,recordNO,total);
        System.out.println("----------------------------------------");

        //Part 1 Question 3 Sorting and Searching: Algorithm Analysis: 3
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please enter a film length");
                Float target = Float.valueOf(sc1.nextLine());
                BinarySearch.binarySearch(filmsCopy6, target);
                LinearSearch.search(filmsCopy6, target);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }

        //Part 2 Defensive Programming and Exception Handling:1 and 2
        System.out.println("------------------Part 2---------------");
        AddFilm.add(films);

        //Part 3
        System.out.println("------------------Part 3---------------");
        int timeLimit;

        while (true) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Please enter a time limit");
                timeLimit = sc2.nextInt();
                if (timeLimit < 0) {
                    System.out.println("Please enter a non-negative integer");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a non-negative integer");
            }
        }

        List<Film1> films1 = HighRating.getHighRating(films, timeLimit);
        float totalRating1=0;
        float totalL1=0;
        for(Film1 film: films1){
            totalRating1+=film.getRating();
            totalL1+=film.getLength();
        }
        System.out.println(films1);
        List<Film> films2 = MovieSelection.selectMovies(films, timeLimit);
        Set<Film> set = new HashSet<>();

        float totalRating2=0;
        float totalL=0;
        for(Film film: films2){
            totalRating2+=film.getRating();
            totalL+=film.getLength();
            set.add(film);
        }
        System.out.println(films2);
        System.out.println("--------------------greedy algorithm---------------------");
        System.out.println("There are "+films1.size()+" found! The total ratings are "+totalRating1+". The total length of these films is "+totalL1);

        System.out.println("--------------------knapsack----------------------------");
        System.out.println("There are "+films2.size()+" found! The total ratings are "+totalRating2+". The total length of these films is "+totalL);
    }

}


