import javax.swing.JFrame;

public class Typing {

	public static void main(String[] args) {
		Keyboard kb = new Keyboard();
		JFrame window = new JFrame("नेपाली");
		window.add(kb);
		window.setSize(728,300);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
		
	}

}
