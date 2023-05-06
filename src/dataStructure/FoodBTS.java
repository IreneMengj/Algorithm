package dataStructure;

public class FoodBTS extends BinarySearchTree{
    public static void main(String[] args) {

        Food food1=new Food("haha","hehe",32,43,54,4);
        Food food2=new Food("yingying","hehe",35,43,54,4);
        Food food3=new Food("hengheng","hehe",30,43,54,4);
        FoodBTS bts = new FoodBTS();
        bts.insert(food1);
        bts.insert(food2);
        bts.insert(food3);
        System.out.println(bts.size());

        System.out.println(bts.findMin());
        System.out.println(bts.findMax());
        bts.inOrder();


    }
}
