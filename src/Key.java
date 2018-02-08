import java.awt.BasicStroke;
/**
 * @author Infinite Tech Solution Pvt. Ltd
 * @version 1.0
 * @since 2018
 * {@link http://www.itspl.com.np/}
 */

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
	
	Font font = new Font("TimesRoman", Font.BOLD, 18);
	
	public Key(int width, String upper, String lower, Point location) {
		super();
		hide=false;
		this.width = width;
		this.upper = upper;
		this.lower = lower;

		this.bgColor = new Color(197,208,216);
		this.location = location;
		fontColor=Color.BLACK;
		current = lower;
	}
	public void turnUpper()
	{
		current = upper;
	}
	public void turnLower()//changes keys to lower
	{
		current = lower;
	}
	public void hide()//Hide unnecessary keys from keyboard
	{
		hide=true;
	}
	
	public void press()//Turns keyboard key color to white.
	{
		bgColor = new Color(7, 7, 7);
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
			gd.setColor(Color.black);//Border Color
			gd.drawRoundRect(location.x, location.y, width, 40, 0, 0);//Border
			
			g.setFont(font);//Customized font set.
			g.setColor(fontColor);//Font Color.
			g.drawString(current, location.x, location.y+25);
		}
	}
	
	
	
	
}
