package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo40 {
    public static void main(String[] args) {
        String[] array ={"bella","label","roller"};
        List<String> strings = commonChars(array);
        System.out.println(strings);

    }
    public static List<String> commonChars(String[] words) {

        int[] table = new int[26];
        Arrays.fill(table, Integer.MAX_VALUE);

        // For every word in A
        for(String word : words) {
            // Count the frequency of chars in word
            int[] freq = new int[26];
            for(char c : word.toCharArray()) freq[c - 'a']++;

            // Find the min frequency of char in all the words
            for(int i =  0; i < table.length; i++) {
                table[i] = Math.min(table[i], freq[i]);
            }
        }

        // Generate ans
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < table.length; i++) {
            while(table[i] > 0) {
                ans.add((char) ('a' + i) + "");
                table[i]--;
            }
        }

        return ans;
    }



}
