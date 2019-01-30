package elements;

import java.util.Vector;

public class Skill {
    String name;
    String description;
    Vector<Attribute> attributes;
    public Skill(String name,String description) {
    	this.name = new String(name);
    	this.description = new String(description);
    	attributes = new Vector<Attribute>();
    }
    public void addAttribute(Attribute attribute) {
    	attributes.add(attribute);
    }
}
