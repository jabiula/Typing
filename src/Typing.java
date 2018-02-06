import javax.swing.JFrame;

public class Typing {

	public static void main(String[] args) {
		
		JFrame window;
		Language currentLang = Language.Nepali;

		Keyboard kb = new Keyboard(currentLang);
		

		if(currentLang==Language.English)
			window = new JFrame("English Keyboard");
		else
			window = new JFrame("नेपाली किबोर्ड");

		window.add(kb);
		window.setSize(728,300);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
		
	}

}
