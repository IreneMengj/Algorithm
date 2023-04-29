package JavaWeb;
//computer class with two methods

@AnnoDemo1(value = 13,show="haha",strs="heihei",p=Person.p1)
public class Computer {
    public String name;
    int age;

    public Computer() {
    }

    public Computer(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer add(int a, int b){
        return a+b;
    }
    public Integer reduce(int a,int b){
        return a-b;
    }

    public void eat(){
        System.out.println("eat...");
    }
}
