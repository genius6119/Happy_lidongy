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
        Thread.sleep(3000);
        Person p = DeserializePerson();//反序列Perons对象
        System.out.println(p.toString());
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     *
     */
    private static void SerializePerson(Person person) throws FileNotFoundException,IOException {

        // ObjectOutputStream 对象输出流，将Person对象存储到项目下的Person.123文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("src/Person.123")));
        oo.writeObject(person);
        System.out.println("Person存档成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     *
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("src/Person.123")));
        Person person = (Person) ois.readObject();
        System.out.println("Person载入存档成功！");
        return person;
    }


}
