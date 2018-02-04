import javax.swing.JFrame;

public class Typing {

	public static void main(String[] args) {
		Keyboard kb = new Keyboard();
		JFrame window = new JFrame("On Screen Keyboard");
		window.add(kb);
		window.setSize(700,300);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
	}

}
