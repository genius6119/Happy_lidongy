package launch;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import uitools.LButton;
import uitools.LFrame;
import uitools.LLabel;
import uitoolsFectory.LFrame_Menu;

public class Test {

	public static void main(String[] args) {
    LFrame_Menu frame = new LFrame_Menu("��ʼ��Ϸ");
    frame.addTheme("�������˫֮Ǳ������");
    frame.addBackground("c:/timg.jpg");
    frame.addOption("��ʼ��Ϸ");
    frame.addOption("����浵");
    frame.addOption("�ɾ�һ��");
    frame.addOption("��ʼ��Ϸ");
    frame.addOption("��ʼ��Ϸ");
    frame.addOption("��ʼ��Ϸ");
    frame.addOption("��ʼ��Ϸ");
    frame.addOption("��ʼ��Ϸ");
    frame.display();
	}
}
