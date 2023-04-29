package JavaWeb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//simple test frame
//when execute main method,it will test all methods with annotations automatically  and document to a file if exception exists
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.create calculator object
        Calculator c = new Calculator();
        //2. get bytecode file object
        Class<? extends Calculator> aClass = c.getClass();
        //3. get all methods
        Method[] methods = aClass.getMethods();
        int number =0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for(Method method:methods){
            //4.Determine whether the method has a @check annotation
            if(method.isAnnotationPresent(check.class)){
                try {
                    //if has,execute
                    method.invoke(c);
                } catch (Exception e) {
                    //catch exceptions
                    number++;
                    bw.write(method.getName()+" has exceptions");
                    bw.newLine();
                    bw.write("Exception name: "+e.getCause());
                    bw.newLine();
                    bw.write("Exception reason: "+e.getMessage());
                    bw.newLine();
                    bw.write("------------------");
                }
            }
        }
        bw.write("There were "+number+" exceptions in this test.");
        bw.flush();
        bw.close();

        //5.
        //6.
    }
}
