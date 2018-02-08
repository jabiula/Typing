import javax.swing.JFrame;
/**
 * @author Infinite Tech Solution Pvt. Ltd
 * @version 1.0
 * @since 2018
 * {@link http://www.itspl.com.np/}
 */
public class Typing {

	public static void main(String[] args) {
		
		JFrame window;
		Language currentLang = Language.English;

		Keyboard kb = new Keyboard(currentLang);
		

		if(currentLang==Language.English)
			window = new JFrame("English Keyboard");//sets title of the window to English
		else
			window = new JFrame("नेपाली किबोर्ड");//set title of the window to Nepali

		window.add(kb);
		window.setSize(728,278);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
		
	}

}
