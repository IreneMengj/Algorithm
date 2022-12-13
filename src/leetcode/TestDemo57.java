package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestDemo57 {
    public static void main(String[] args) {
        int[][] matrix ={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> integers = luckyNumbers(matrix);
        System.out.println(integers);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> row = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            row.add(min);
        }
        List<Integer> column = new ArrayList<>();
        for(int i =0;i<matrix[0].length;i++){
            int max=0;
            for(int j = 0;j<matrix.length;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }

            }
            column.add(max);

        }


        List<Integer> lucky =new ArrayList<>();

        for(int i=0;i<row.size();i++){
            for(int j=0;j<column.size();j++){
                if(row.get(i)==matrix[i][j]&&column.get(j)==matrix[i][j]){
                    lucky.add(matrix[i][j]);
                }
            }
        }

       return lucky;
    }
}
