/**
 * @author Infinite Tech Solution Pvt. Ltd
 * @version 1.0
 * @since 2018
 * {@link http://www.itspl.com.np/}
 */
public class KeyText {
String upper,lower;//Upper stores the upper character and lower stores the lower character
int size; //stores the size of the key



/**
 * Contructor needs upper symbol (When Shift is pressed), lower symbol and size of the key
 * @param upper Letter to show when shift key is pressed.
 * @param lower Letter to show when shift key is not pressed.
 * @param size Width of the key
 */
public KeyText(String upper, String lower,int size) {
	super();
	this.upper = upper;
	this.lower = lower;
	this.size = size;
}


/**
 * This getter will return upper case of the key
 * @return upper case character
 */
public String getUpper() {
	return upper;
}
/**
 * This getter will return lower case of the key
 * @return lower case character
 */
public String getLower() {
	return lower;
}

/**
 * This getter will return the width of the key in the keyboard.
 * @return the width of the key
 */

public int getSize()
{
	return size;
}

}
