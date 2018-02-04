import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

public class Key {

	int width;
	String upper,lower,current;
	Color bgColor;
	Point location;
	boolean hide;
	Font font = new Font("TimesRoman", Font.PLAIN, 18);
	public Key(int width, String upper, String lower, Point location) {
		super();
		hide=false;
		this.width = width;
		this.upper = upper;
		this.lower = lower;
		this.bgColor = Color.white;
		this.location = location;
		
		current = lower;
	}
	public void hide()
	{
		hide=true;
	}
	
	public void press()
	{
		bgColor = Color.green;
	}
	public void release()
	{
		bgColor = Color.white;
	}
	public void wrong()
	{
		bgColor = Color.red;
	}
	
	public void paint(Graphics g)
	{
		if(!hide)
		{
			g.setFont(font);
			g.setColor(bgColor);
			g.fillRoundRect(location.x, location.y, width, 40, 20, 20);
			g.setColor(Color.GRAY);
			g.drawRoundRect(location.x, location.y, width, 40, 20, 20);
			g.setColor(Color.BLACK);
			g.drawString(current, location.x+15, location.y+25);
		}
	}
	
	
	
	
}
