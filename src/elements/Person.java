package elements;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Zwx
 * @Description:
 * @Date: Create in 12:58 2019/1/31
 */
@Data
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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
