public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int length = array.length;
        int[] new_array = new int[array.length+1];
        new_array[0]=1;
        for(int i:new_array){
            System.out.println(i);
        }

    }
}
