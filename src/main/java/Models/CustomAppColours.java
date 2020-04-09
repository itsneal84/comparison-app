package Models;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Neal Nisbet B00380762
 */
public class CustomAppColours extends Applet {
    public void paint(Graphics g){
        /*
        * To create a custom color using RGB, use
        * Color(int red,int green, int blue)
        * constructor of Color class.
        */
        Color appDarkBlue = new Color(3,22,52);
        Color appMidBlue = new Color(3,54,73);
        Color appLightBlue = new Color(29,74,92);
        Color appTeal = new Color(3,101,100);
        Color appBackGround = new Color(232,221,203);
    }
}
