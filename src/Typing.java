import javax.swing.JFrame;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
/**
 * @author Infinite Tech Solution Pvt. Ltd
 * @version 1.0
 * @since 2018
 * {@link http://www.itspl.com.np/}
 */
public class Typing {

	public static void main(String[] args) {
		/*
		 *Global key listener 
		 */
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}

		
		JFrame window;
		Language currentLang = Language.Nepali;

		Keyboard kb = new Keyboard(currentLang);
		

		if(currentLang==Language.English)
			window = new JFrame("English Keyboard");//sets title of the window to English
		else
			window = new JFrame("नेपाली किबोर्ड");//set title of the window to Nepali

		window.add(kb);
		window.setSize(728,282);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
		window.addWindowFocusListener(kb);
		GlobalScreen.addNativeKeyListener(kb);
	}        
}
