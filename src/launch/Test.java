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
    LFrame_Menu frame = new LFrame_Menu("开始游戏");
    frame.addTheme("真五国无双之潜龙入梦");
    frame.addBackground("c:/timg.jpg");
    frame.addOption("开始游戏");
    frame.addOption("载入存档");
    frame.addOption("成就一览");
    frame.addOption("开始游戏");
    frame.addOption("开始游戏");
    frame.addOption("开始游戏");
    frame.addOption("开始游戏");
    frame.addOption("开始游戏");
    frame.display();
	}
}
