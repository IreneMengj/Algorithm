package assignment.part1.sortAlgorithm;


import assignment.Film;

public class SelectionSort {
    public static void selectionSort(Film[] arr, int recordNO) {
        int n = recordNO;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] .compareTo(arr[min_idx])<0) {
                    min_idx = j;
                }
            }
            // swap arr[min_idx] and arr[i]
            Film temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void selectionRunTime(Film[] films,Long executionNO,int[] recordNO,Long total) {
        for (int j = 0; j < recordNO.length; j++) {
            long n = executionNO;
            while (n > 0) {
                long startTime = System.currentTimeMillis();

                selectionSort(films, recordNO[j]);

                long endTime = System.currentTimeMillis();
                total += endTime - startTime;
                n--;
            }
            long average = total / executionNO;
            System.out.println("Selection sort: The average elapsed time for " + recordNO[j] + " records is " + average + "ms");
        }
    }
}
