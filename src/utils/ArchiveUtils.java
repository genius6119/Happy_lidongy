package utils;

import elements.Person;
import sun.misc.IOUtils;

import java.io.*;
import java.text.MessageFormat;

/**
 * @Author: Zwx
 * @Description: 序列化存档工具类
 * @Date: Create in 12:38 2019/1/31
 */
public class ArchiveUtils implements Serializable {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("张文轩");
        person.setAge(25);
        person.setSex("男");
        SerializePerson(person);//序列化Person对象
        Person p = DeserializePerson();//反序列Perons对象
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                p.getName(), p.getAge(), p.getSex()));
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     *
     */
    private static void SerializePerson(Person person) throws FileNotFoundException,IOException {

        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("src/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     *
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("src/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }


}
