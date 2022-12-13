package leetcode;

import java.util.*;

public class TestDemo55 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};

        int lucky = findLucky(arr);
        System.out.println(lucky);
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>();

        for (int i : set) {
            if (map.get(i) == i) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            return -1;
        }
        int max = 0;
        for (int i : list) {
            if (i >= max) {
                max = i;
            }
        }
        return max;
    }
}
