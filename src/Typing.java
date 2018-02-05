import javax.swing.JFrame;

public class Typing {

	public static void main(String[] args) {
		int lang = 1;
		String title;
		Keyboard kb = new Keyboard(lang);
		
		if(lang==1)
			title="नेपाली Keyboard";
		else
			title="English Keyboard";
		
		JFrame window = new JFrame(title);
		window.add(kb);
		window.setSize(728,300);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.addKeyListener(kb);
		
	}

}
