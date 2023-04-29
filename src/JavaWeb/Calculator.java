package JavaWeb;

public class Calculator {
    @check
    public double add(double a,double b){
        return a+b;
    }
    @check
    public double sub(double a,double b){
        return a-b;
    }
    @check
    public double multiply(double a,double b){
        return a*b;
    }
    @check
    public double divide(double a,double b){
        return a/b;
    }

    public void show(){
        System.out.println("show...");
    }
}
