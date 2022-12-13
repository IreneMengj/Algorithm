package leetcode;

public class TestDemo46 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {

                for(int j=i+1;j<arr.length-1;j++){
                    int temp = arr[i+1];
                    arr[i+1]=0;
                    arr[j+1]=temp;

                }
                i++;
            }
        }
        for(int i: arr)
        System.out.println(i);
    }
}
