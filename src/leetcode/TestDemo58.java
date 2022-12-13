package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo58 {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> lists = minimumAbsDifference(arr);
        System.out.println(lists);

    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i + 1 < arr.length; ++i) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                ans.clear();
            }
            if (diff == min)
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
        }

        return ans;
    }
}
