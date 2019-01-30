package uitools;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public final class LLabel extends JLabel{

	public LLabel(String content,Font font,Color color) {
		super(content);
		this.setFont(font);
		this.setForeground(color);
	
	}
	public LLabel(ImageIcon imageIcon) {
		super(imageIcon);
	}
}
