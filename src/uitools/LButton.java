package uitools;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class LButton extends JButton{

	public LButton(String content,Font font,Color color) {//���ݣ����壬��ɫ
		super(content);
		this.setFont(font);
		this.setForeground(color);
	}
}
