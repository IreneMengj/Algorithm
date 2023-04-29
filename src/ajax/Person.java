package ajax;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Person {
    String name;
    int age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date birthday;

    public Person(String name, int age,Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday=birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
}
