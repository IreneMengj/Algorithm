package JavaWeb;

import java.lang.reflect.Field;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1.Class.forname
//        Class cls1=Class.forName("JavaWeb.Computer");
//        System.out.println(cls1);
        //2. class name
        Class<Computer> computerClass = Computer.class;
//        System.out.println(cls2);
        //3. getClass()
//        Computer computer=new Computer();
//        Class<? extends Computer> cls3 = computer.getClass();
//        System.out.println(cls3);
        Field[] fields = computerClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }
        Field name = computerClass.getField("name");
        System.out.println(name);
        Computer c = new Computer();
        Object o = name.get(c);
        System.out.println(o);
        name.set(c,"mac");
        System.out.println(c.name);

        System.out.println("==================");
        computerClass.getDeclaredFields();
        Field name1 = computerClass.getDeclaredField("name");
        //Ignore security checks for access modifiers
        name1.setAccessible(true);//reflection attack
        name1.get(c);

    }
}
