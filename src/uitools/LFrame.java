package uitools;

import java.awt.Color;

import javax.swing.JFrame;

public class LFrame extends JFrame{

	public LFrame(String title,Color color,int a,int b,int c,int d){//���⣬��ɫ��λ�ã���С
		super(title);
		this.getContentPane().setBackground(color);
		this.setBounds(a,b,c,d);
	}


}