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
        FontMetrics fm = getFontMetrics( f );
        int x = fm.stringWidth( "AUTOMATED TELLER MACHINE" );
        int y = fm.stringWidth( " " );
        int z = getWidth() - x;
        int w = z / y;
        String pad = "";
        //for (int i=0; i!=w; i++) pad +=" ";
        pad = String.format( "%" + w + "s", pad );
        setTitle( pad + "AUTOMATED TELLER MACHINE" );
        setSize( 750, 750 );
        setLayout( null );
        setBackground( Color.GRAY );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );

        j1 = new JLabel( "WELCOME TO ATM" );
        j1.setFont( new Font( "Osward", Font.BOLD, 38 ) );
        j1.setBounds( 175, 50, 450, 200 );

        j2 = new JLabel( "Card No:" );
        j2.setFont( new Font( "Raleway", Font.BOLD, 28 ) );
        j2.setBounds( 125, 150, 375, 200 );

        j3 = new JLabel( "PIN:" );
        j3.setFont( new Font( "Raleway", Font.BOLD, 28 ) );
        j3.setBounds( 125, 250, 375, 200 );

        t1 = new JTextField( 15 );
        t1.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        t1.setBounds( 300, 235, 230, 30 );


        p1 = new JPasswordField( 15 );
        p1.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        p1.setBounds( 300, 335, 230, 30 );

        b1 = new JButton( "SIGN IN" );
        b1.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        b1.setBounds( 300, 400, 100, 30 );
        b1.setBackground( Color.BLACK );
        b1.setForeground( Color.WHITE );

        b2 = new JButton( "CLEAR" );
        b2.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        b2.setBounds( 430, 400, 100, 30 );
        b2.setBackground( Color.BLACK );
        b2.setForeground( Color.WHITE );

        b3 = new JButton( "SIGN UP" );
        b3.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        b3.setBounds( 300, 450, 230, 30 );
        b3.setBackground( Color.BLACK );
        b3.setForeground( Color.WHITE );


        add( j1 );
        add( j2 );
        add( j3 );
        add( t1 );
        add( p1 );
        add( b1 );
        add( b2 );
        add( b3 );

    }
    public static void main(String[] args) {
        new Login().setVisible( true );
    }
}
