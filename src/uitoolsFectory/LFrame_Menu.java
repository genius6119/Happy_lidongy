package uitoolsFectory;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;

import uitools.LFrame;
import uitools.LLabel;
import uitools.LButton;

public class LFrame_Menu extends LFrame{
	Vector<LButton> buttons;
	LLabel label;
	JLayeredPane layeredPane;
	ImageIcon imageIcon;
	LLabel label2;
	
	public LFrame_Menu(String title) {
		super(title,Color.white,700,150,450,650);
		buttons = new Vector<LButton>();
		layeredPane = new JLayeredPane();
	}
	
	public void addLabel(LLabel lb) {
		label = lb;
	}
	
	public void addButton(LButton btn) {
		if(buttons.size()==8)
			System.out.println("LFrame_Menu��button����");
		else
		    buttons.add(btn);
	}
	
	public void addBackground(String path) {
		imageIcon = new ImageIcon(path);
		label2 = new LLabel(imageIcon);
	}
	
	public void addTheme (String theme) {
		LLabel lb = new LLabel(theme,new Font("Dialog",1,30),Color.white);
	    this.addLabel(lb);
	}

	public void addOption (String option) {
		LButton btn = new LButton(option,new Font("Dialog",1,20),Color.black);
		this.addButton(btn);
	}
	
	public void display() {
		label2.setBounds(0,0,450,650);
		label.setBounds(0,10,400,30);
	    this.getContentPane().setLayout(null);
	    layeredPane.add(label,new Integer(100));
		layeredPane.add(label2,new Integer(50));
		int i = 0;
        for(LButton button:buttons) {
	        button.setBounds(150, 100 + i * 50, 230, 25);
	        layeredPane.add(button,new Integer(100));
	        i++;
	    }
		this.setContentPane(layeredPane);
        this.setVisible(true);
	}
	
}


