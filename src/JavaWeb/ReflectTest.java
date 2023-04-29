package JavaWeb;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

    public static void main(String[] args) throws Exception {
        //load properties
        //1.1 create pro object
        Properties pro = new Properties();
        //1.2load properties and convert to a collection
        //1.2.1 get configuration under class catalog
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(resourceAsStream);
        //2.get data defined in configuration
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3.Load the class into memory
        Class<?> aClass = Class.forName(className);
        //4.create object
        Object o = aClass.newInstance();
        //5.get method objects
        Method method = aClass.getMethod(methodName);
        //6.execute method
        method.invoke(o);
    }


}
