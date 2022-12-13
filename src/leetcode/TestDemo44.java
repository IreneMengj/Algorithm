package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TestDemo44 {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

        String[] relativeRanks = findRelativeRanks(nums);
        for(String s:relativeRanks){
            System.out.println(s);
        }
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] s = new String[score.length];
        if(score.length==1){
            s[0]="Gold Medal";
            return s;
        }
        if(score.length==2&&score[0]>score[1]){
            s[0]="Gold Medal";
            s[1]="Silver Medal";
            return s;
        }else if(score.length==2&&score[0]<score[1]){
            s[0]="Silver Medal";
            s[1]="Gold Medal";
            return s;
        }
        int[] temp=score;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        s[score.length-1]="Gold Medal";
        s[score.length-2]="Silver Medal";
        s[score.length-3]="Bronze Medal";
        for(int i=score.length-4;i>=0;i--){

        }
    return s;
    }
}
