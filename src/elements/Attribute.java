package elements;

import lombok.Data;
import java.io.Serializable;


@Data
public class Attribute implements Serializable {
    private String name;
    private Integer num;

    public Attribute(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public Attribute() {
    }

    public static void main(String[] args) {
        Attribute a=new Attribute();
        a.setName("李东原");
        System.out.println(a.getName());
    }
}
