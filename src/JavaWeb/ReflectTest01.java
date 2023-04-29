package JavaWeb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Pro(className = "JavaWeb.Computer",methodName = "eat")
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.Parsing annotation
        //1.1 Gets the class bytecode file object
        Class<ReflectTest01> reflectTest01Class = ReflectTest01.class;
        //2. Gets the annotation object above
        //A subclass implementation object of the annotation interface is generated in memory
        /*
        public class ProImpl implements Pro{
           String className(){
                return "JavaWeb.Computer";
           }
           String methodName(){
                return "eat";
           }
        }
         */
        Pro annotation = reflectTest01Class.getAnnotation(Pro.class);

        //3. Call the abstract method defined by the annotation to get the return value
        String className = annotation.className();
        String methodName = annotation.methodName();
        //4.Load the class into memory
        Class<?> aClass = Class.forName(className);
        //5.create object
        Object o = aClass.newInstance();
        //6.get method objects
        Method method = aClass.getMethod(methodName);
        //7.execute method
        method.invoke(o);
    }
}
