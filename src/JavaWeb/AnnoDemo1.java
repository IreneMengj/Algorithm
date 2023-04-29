package JavaWeb;


import java.lang.annotation.*;

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//Indicates that this annotation can only be applied to the class
@Retention(RetentionPolicy.RUNTIME)//The annotation currently described is kept in the class bytecode file and read by the JVM
@Documented
@Inherited
public @interface AnnoDemo1 {
    int value();
    String show();//string
    String[] strs(); //array
    Person p();//enum
}
