package elements;

import java.io.Serializable;

/**
 * @Author: Zwx
 * @Description:
 * @Date: Create in 12:58 2019/1/31
 */
public class Person implements Serializable {
    private int age;
    private String name;
    private String sex;

    public Person() {
    }

    public Person(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
