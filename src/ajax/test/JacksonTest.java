package ajax.test;

import ajax.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.*;

public class JacksonTest {
    //java convert to json
    @Test
    public void test1() throws Exception {
       //create person object
       Person p = new Person("irene",40,new Date());
       //create jackson core object,ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        //conversion: convert object to string
        String s = mapper.writeValueAsString(p);
        System.out.println(s);
    }
    @Test//list converts to json
    public void test3() throws Exception {
        //create person object
        Person p = new Person("irene",40,new Date());
        Person p1 = new Person("irene1",40,new Date());
        Person p2 = new Person("irene2",40,new Date());
        List<Person> list=new ArrayList<>();
        list.add(p);
        list.add(p1);
        list.add(p2);
        //create jackson core object,ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        //conversion: convert object to string
        String s = mapper.writeValueAsString(list);
        System.out.println(s);
    }
    @Test//map converts to json
    public void test2() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("name","irene");
        map.put("age",20);
        //create jackson core object,ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        //conversion: convert object to string
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }
    @Test//jason to java
    public void test4() throws Exception {

    }
}
