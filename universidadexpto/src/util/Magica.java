package util;

import javax.swing.JOptionPane;

public class Magica {
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static boolean bool(String msg, String title) {		
		return Boolean.parseBoolean(JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION)==0);
	}
}
