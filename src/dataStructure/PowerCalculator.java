package dataStructure;

public class PowerCalculator {
    public static int power(int base, int exponent){
        if(exponent==0){
            return 1;
        }else if(exponent%2==0){
            int halfPower = power(base, exponent / 2);
            return halfPower*halfPower;
        }else{
            int halfPower= power(base,exponent/2);
            return base*halfPower*halfPower;
        }
    }
}
