package Test;

import Sort.Student;

//define method getMax(Comparable c1,Comparable c2)
public class TestComparable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(30);
        Student s2 = new Student();
        s2.setAge(40);
        Comparable max = getMax(s1, s2);
        System.out.println(max);

    }
    public static Comparable getMax(Comparable c1,Comparable c2){
        int i = c1.compareTo(c2);
        // if i<0, c1<c2;if i=0, c1=c2;if i>0, c1>c2.
        if(i<0){
            return c2;
        }else {
            return c1;
        }
    }
}
