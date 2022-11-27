package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TestDemo8 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ints = nextGreaterElement(nums1, nums2);
        for (int i : ints) {
            System.out.println(i);
        }

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] res = new int[nums1.length];


        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                int start = map.get(nums1[i]);
                if (start == nums2.length - 1) {
                    res[i] = -1;
                } else {
                    for (int j = start + 1; j < nums2.length; j++) {
                        if (nums2[j] > nums1[i]) {
                            res[i] = nums2[j];
                            break;
                        }else{
                            res[i]=-1;
                        }

                    }
                }


            }
        }
        return res;
    }
}
