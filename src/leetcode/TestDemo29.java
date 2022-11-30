package leetcode;
//599. Minimum Index Sum of Two Lists
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestDemo29 {
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] restaurant = findRestaurant(list1, list2);
        for(String s:restaurant){
            System.out.println(s);
        }
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                }
            }
        }
        Set<String> set = map.keySet();
        int min =Integer.MAX_VALUE;
        for(String s:set){
            if(map.get(s)<min){
                min=map.get(s);
            }
        }
        List<String> list = new ArrayList<>();
        for(String s:set){
            if(map.get(s)==min){
                list.add(s);
            }
        }
        String[] num = new String[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=list.get(i);
        }
        return num;

    }
}
