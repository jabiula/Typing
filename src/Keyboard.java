import java.awt.Color;
/**
 * @author Infinite Tech Solution Pvt. Ltd
 * @version 1.0
 * @since 2018
 * {@link http://www.itspl.com.np/}
 */

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Keyboard extends JPanel implements KeyListener{

//	Key a = new Key(40, "A", "a", news Point(10,10));
	Color bgcolor = new Color(162, 166, 173);
	KeyText text[][][]= 
	{
		{
			{new KeyText("~","`",40),new KeyText("!","1",40),new KeyText("@","2",40),new KeyText("#","3",40),new KeyText("$","4",40),new KeyText("%","5",40),new KeyText("^","6",40),new KeyText("&","7",40),new KeyText("*","8",40),new KeyText("(","9",40),new KeyText(")","0",40),new KeyText("_","-",40),new KeyText("+","=",40),new KeyText("  Back","  Back",89)},
			{new KeyText("Tab","Tab",60),new KeyText("Q","q",40),new KeyText("W","w",40),new KeyText("E","e",40),new KeyText("R","r",40),new KeyText("T","t",40),new KeyText("Y","y",40),new KeyText("U","u",40),new KeyText("I","i",40),new KeyText("O","o",40),new KeyText("P","p",40),new KeyText("{","[",40),new KeyText("}","]",40),new KeyText("Enter","Enter",70)},
			{new KeyText("Caps","Caps",74),new KeyText("A","a",40),new KeyText("S","s",40),new KeyText("D","d",40),new KeyText("F","f",40),new KeyText("G","g",40),new KeyText("H","h",40),new KeyText("J","j",40),new KeyText("K","k",40),new KeyText("L","l",40),new KeyText(":",";",40),new KeyText("\"","'",40),new KeyText("|","\\",103),new KeyText("hide","hide",40)},
			{new KeyText("  Shift","  Shift",100),new KeyText("Z","z",40),new KeyText("X","x",40),new KeyText("C","c",40),new KeyText("V","v",40),new KeyText("B","b",40),new KeyText("N","n",40),new KeyText("M","m",40),new KeyText("<",",",40),new KeyText(">",".",40),new KeyText("?","/",40),new KeyText("    Shift","    Shift",123),new KeyText(">","<",80),new KeyText("","",40)},
			{new KeyText("Ctrl","Ctrl",80),new KeyText("fn","fn",0),new KeyText("start","start",0),new KeyText("Alt","Alt",60),new KeyText("                       Space","                       Space",370),new KeyText("Alt","Alt",60),new KeyText("","",8),new KeyText("Ctrl","Ctrl",80),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40)}
		},

		{
			{new KeyText("","",40),new KeyText("ज्ञ","१",40),new KeyText("","२",40),new KeyText("घ","३",40),new KeyText("","४",40),new KeyText("छ","५",40),new KeyText("ट","६",40),new KeyText("ठ","७",40),new KeyText("ड","८",40),new KeyText("ढ","९",40),new KeyText("","०",40),new KeyText("","-",40),new KeyText("","=",40),new KeyText("  Back","  Back",89)},
			{new KeyText("Tab","Tab",60),new KeyText("त्त","",40),new KeyText("","ध",40),new KeyText("","भ",40),new KeyText("","च",40),new KeyText("","त",40),new KeyText("","थ",40),new KeyText("","ग",40),new KeyText("","",40),new KeyText("इ","य",40),new KeyText("ए","उ",40),new KeyText("{","[",40),new KeyText("}","]",40),new KeyText("Enter","Enter",70)},
			{new KeyText("Caps","Caps",74),new KeyText("","ब",40),new KeyText("","क",40),new KeyText("","म",40),new KeyText("","ा",40),new KeyText("","न",40),new KeyText("","ज",40),new KeyText("","व",40),new KeyText("","प",40),new KeyText(" ी"," ि",40),new KeyText(":","स",40),new KeyText("\"","'",40),new KeyText("|","\\",103),new KeyText("hide","hide",40)},
			{new KeyText("  Shift","  Shift",100),new KeyText("श","",40),new KeyText("","ह",40),new KeyText("ऋ","अ",40),new KeyText("","ख",40),new KeyText("","द",40),new KeyText("","ल",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("?","र",40),new KeyText("    Shift","    Shift",123),new KeyText(">","<",80),new KeyText("","",40)},
			{new KeyText("Ctrl","Ctrl",80),new KeyText("fn","fn",0),new KeyText("start","start",0),new KeyText("Alt","Alt",60),new KeyText("                       Space","                       Space",370),new KeyText("Alt","Alt",60),new KeyText("","",8),new KeyText("Ctrl","Ctrl",80),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40),new KeyText("","",40)}
		}
	};
		
	Key keys[][];
	int x,y,l;
	boolean isOn;
	public Keyboard(Language lang)
	{
		x=y=8;
		keys = new Key[5][14];
//		if(lang==Language.English)
//			l=0;
//		else
//			l=1;
		l=(lang==Language.English)?0:1;
		for(int row=0;row<5;row++)
		{
			x=8;
			for(int col=0;col<14;col++)
			{
				KeyText t = text[l][row][col];
				keys[row][col]=new Key(t.getSize(),t.getUpper(),t.getLower(),new Point(x,y));
				x+=t.getSize()+8;
			}
			y+=48;
		}
		hideNotRequiredButtons();
	}
	private void hideNotRequiredButtons()
	{

		keys[2][13].hide();
		keys[3][12].hide();
		keys[3][13].hide();
		keys[4][1].hide();
		keys[4][2].hide();
		keys[4][6].hide();
		keys[4][8].hide();
		keys[4][9].hide();
		keys[4][10].hide();
		keys[4][11].hide();
		keys[4][12].hide();
		keys[4][13].hide();
		
	}
	public void paint(Graphics g)
	{
		g.setColor(bgcolor);
		g.fillRect(0, 0, 728, 300);
		for(int row=0;row<5;row++)
		{
			for(int col=0;col<14;col++)
			{
				keys[row][col].paint(g);
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// This line of code finds out the Caps lock is on or off.
		isOn= Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		// Below line of codes will turn all the keys letter to upper case if shift is up or caps lock is on
		if(event.isShiftDown()||isOn)
		{
			for(int row=0;row<5;row++)
			{
				for(int col=0;col<14;col++)
				{
					
					keys[row][col].turnUpper();;
				}
			}
		}
		
		switch(event.getKeyCode())
		{
			case 192:
				keys[0][0].press();
				break;
			case 49:
				keys[0][1].press();
				break;
			case 50:
				keys[0][2].press();
				break;
			case 51:
				keys[0][3].press();
				break;
			case 52:
				keys[0][4].press();
				break;
			case 53:
				keys[0][5].press();
				break;
			case 54:
				keys[0][6].press();
				break;
			case 55:
				keys[0][7].press();
				break;
			case 56:
				keys[0][8].press();
				break;
			case 57:
				keys[0][9].press();
				break;
			case 48:
				keys[0][10].press();
				break;
			case 45:
				keys[0][11].press();
				break;
			case 61:
				keys[0][12].press();
				break;
			case 8:
				keys[0][13].press();
				break;
				//Tab is missing
			case KeyEvent.VK_TAB:
				keys[1][0].press();
				break;
			case 81:
				keys[1][1].press();
				break;
			case 87:
				keys[1][2].press();
				break;
			case 69:
				keys[1][3].press();
				break;
			case 82:
				keys[1][4].press();
				break;
			case 84:
				keys[1][5].press();
				break;
			case 89:
				keys[1][6].press();
				break;
			case 85:
				keys[1][7].press();
				break;
			case 73:
				keys[1][8].press();
				break;
			case 79:
				keys[1][9].press();
				break;
			case 80:
				keys[1][10].press();
				break;
			case 91:
				keys[1][11].press();
				break;
			case 93:
				keys[1][12].press();
				break;
			case 10:
				keys[1][13].press();
				break;
			case 20:
				keys[2][0].press();
				break;
			case 65:
				keys[2][1].press();
				break;
			case 83:
				keys[2][2].press();
				break;
			case 68:
				keys[2][3].press();
				break;
			case 70:
				keys[2][4].press();
				break;
			case 71:
				keys[2][5].press();
				break;
			case 72:
				keys[2][6].press();
				break;
			case 74:
				keys[2][7].press();
				break;
			case 75:
				keys[2][8].press();
				break;
			case 76:
				keys[2][9].press();
				break;
			case 59:
				keys[2][10].press();
				break;
			case 222:
				keys[2][11].press();
				break;
			case 92:
				keys[2][12].press();
				break;
			case 16:
				keys[3][11].press();
				keys[3][0].press();
				break;
			case 153:
				keys[3][12].press();
				break;
			case 90:
				keys[3][1].press();
				break;
			case 88:
				keys[3][2].press();
				break;
			case 67:
				keys[3][3].press();
				break;
			case 86:
				keys[3][4].press();
				break;
			case 66:
				keys[3][5].press();
				break;
			case 78:
				keys[3][6].press();
				break;
			case 77:
				keys[3][7].press();
				break;
			case 44:
				keys[3][8].press();
				break;
			case 46:
				keys[3][9].press();
				break;
			case 47:
				keys[3][10].press();
				break;
//			case 16:
//				keys[3][12].press();
//				break;
			case 17:
				keys[4][0].press();
				keys[4][7].press();
				break;
				//fn
				//start
//			case 18:
//				keys[4][3].press();
//				break;
			case 32:
				keys[4][4].press();
				break;
			case 18:
				keys[4][3].press();
				keys[4][5].press();
				break;
//			case 17:
//				keys[4][6].press();
//				break;
		}
		
		repaint();
		
//		if(isTab)
//			System.out.println("Tab is ON");
//		else
//			System.out.println("Tab is OFF");;
		//System.out.println("Key char: "+event.getKeyChar()+" Code:"+event.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent event) {
		
		//We are checking whether the capslock is on or off
		isOn= Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
		
		//*****************************************************************************************
		/*
		*Keyboard will show lowercase only if the shiftkey is not pressed and Capslock is not ON.
		*/
		if(!event.isShiftDown()&&!isOn)
		{
			for(int row=0;row<5;row++)
			{
				for(int col=0;col<14;col++)
				{
					keys[row][col].turnLower();;
				}
			}
		}
		//*****************************************************************************************
		switch(event.getKeyCode())
		{
			case 192:
				keys[0][0].release();
				break;
			case 49:
				keys[0][1].release();
				break;
			case 50:
				keys[0][2].release();
				break;
			case 51:
				keys[0][3].release();
				break;
			case 52:
				keys[0][4].release();
				break;
			case 53:
				keys[0][5].release();
				break;
			case 54:
				keys[0][6].release();
				break;
			case 55:
				keys[0][7].release();
				break;
			case 56:
				keys[0][8].release();
				break;
			case 57:
				keys[0][9].release();
				break;
			case 48:
				keys[0][10].release();
				break;
			case 45:
				keys[0][11].release();
				break;
			case 61:
				keys[0][12].release();
				break;
			case 8:
				keys[0][13].release();
				break;
				//Tab is missing
			case 81:
				keys[1][1].release();
				break;
			case 87:
				keys[1][2].release();
				break;
			case 69:
				keys[1][3].release();
				break;
			case 82:
				keys[1][4].release();
				break;
			case 84:
				keys[1][5].release();
				break;
			case 89:
				keys[1][6].release();
				break;
			case 85:
				keys[1][7].release();
				break;
			case 73:
				keys[1][8].release();
				break;
			case 79:
				keys[1][9].release();
				break;
			case 80:
				keys[1][10].release();
				break;
			case 91:
				keys[1][11].release();
				break;
			case 93:
				keys[1][12].release();
				break;
			case 10:
				keys[1][13].release();
				break;
			case 20:
				keys[2][0].release();
				break;
			case 65:
				keys[2][1].release();
				break;
			case 83:
				keys[2][2].release();
				break;
			case 68:
				keys[2][3].release();
				break;
			case 70:
				keys[2][4].release();
				break;
			case 71:
				keys[2][5].release();
				break;
			case 72:
				keys[2][6].release();
				break;
			case 74:
				keys[2][7].release();
				break;
			case 75:
				keys[2][8].release();
				break;
			case 76:
				keys[2][9].release();
				break;
			case 59:
				keys[2][10].release();
				break;
			case 222:
				keys[2][11].release();
				break;
			case 92:
				keys[2][12].release();
				break;
			case 16:
				keys[3][11].release();
				keys[3][0].release();
				break;
			case 153:
				keys[3][13].release();
				break;
			case 90:
				keys[3][1].release();
				break;
			case 88:
				keys[3][2].release();
				break;
			case 67:
				keys[3][3].release();
				break;
			case 86:
				keys[3][4].release();
				break;
			case 66:
				keys[3][5].release();
				break;
			case 78:
				keys[3][6].release();
				break;
			case 77:
				keys[3][7].release();
				break;
			case 44:
				keys[3][8].release();
				break;
			case 46:
				keys[3][9].release();
				break;
			case 47:
				keys[3][10].release();
				break;
//			case 16:
//				keys[3][12].release();
//				break;
			case 17:
				keys[4][0].release();
				keys[4][7].release();
				break;
				//fn
				//start
//			case 18:
//				keys[4][3].release();
//				break;
			case 32:
				keys[4][4].release();
				break;
			case 18:
				keys[4][3].release();
				keys[4][5].release();
				break;
//			case 17:
//				keys[4][6].press();
//				break;
		}
		repaint();
//		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
}
