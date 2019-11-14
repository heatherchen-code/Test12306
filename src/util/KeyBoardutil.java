package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;


public class KeyBoardutil {
	public static void pressEnterKey() {
		Robot robot = null;
		try {
			robot = new Robot();
		}catch(AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	public static void pressTabKey() {
		Robot robot = null;
		try {
			robot = new Robot();
		}catch(AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
	}
}
