import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Key {

	int width;
	String upper,lower,current;
	Color bgColor,fontColor;
	Point location;
	boolean hide;
	
	Font font = new Font("TimesRoman", Font.PLAIN, 18);
	
	public Key(int width, String upper, String lower, Point location) {
		super();
		hide=false;
		this.width = width;
		this.upper = upper;
		this.lower = lower;

		this.bgColor = new Color(197,208,216);
		this.location = location;
		fontColor=Color.black;
		current = lower;
	}
	public void turnUpper()
	{
		current = upper;
	}
	public void turnLower()
	{
		current = lower;
	}
	public void hide()
	{
		hide=true;
	}
	
	public void press()
	{
		bgColor = new Color(67,73,67);
		fontColor=Color.white;
	}
	public void release()
	{
		bgColor = new Color(197, 208, 216);
		fontColor=Color.black;
	}
	public void wrong()
	{
		bgColor = Color.red;
	}
	
	public void paint(Graphics g)
	{
		if(!hide)
		{
			Graphics2D gd = (Graphics2D) g;//Created gd for setting border size coz
										   //Graphics object cannot have line thickness. 
			
			g.setColor(bgColor);//Background Color
			g.fillRoundRect(location.x, location.y, width, 40, 0, 0);//Background
			
			
			gd.setStroke(new BasicStroke(2F));//Border size set.
			gd.setColor(Color.white);//Border Color
			gd.drawRoundRect(location.x, location.y, width, 40, 0, 0);//Border
			
			g.setFont(font);//Customized font set.
			g.setColor(fontColor);//Font Color.
			g.drawString(current, location.x, location.y+25);
		}
	}
	
	
	
	
}
