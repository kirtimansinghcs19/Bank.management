/*   Created by IntelliJ IDEA.
 *   Author:  Kirtiman Singh
 *   Date: 9/19/2020
 *   Time: 7:26 PM
 *   File: Login.java
 */

package ATM_System;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JLabel j1,j2,j3;
    private JTextField t1;
    private JPasswordField p1;
    private JButton b1,b2,b3;
    Login(){
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"AUTOMATED TELLER MACHINE");
        setSize( 700,700 );

        j1 = new JLabel("WELCOME TO ATM");
        j1.setFont(new Font("Osward", Font.BOLD, 38));
    }
    public static void main(String[] args) {
        new Login().setVisible( true );
    }
}
