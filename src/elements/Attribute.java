package elements;

import java.io.Serializable;

public class Attribute implements Serializable {
    String name;
    Integer num;
    Attribute(String name,int num){
    	this.name = new String(name);
    	this.num = new Integer(num);
    }
}
