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
    private JLabel headLine, cardNumber, pin;
    private JTextField cardNumberEnter;
    private JPasswordField enterPin;
    private JButton signIn, clear, signUp;

    Login() {
        setFont( new Font( "System", Font.BOLD, 22 ) );
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

        headLine = new JLabel( "WELCOME TO ATM" );
        headLine.setFont( new Font( "Osward", Font.BOLD, 38 ) );
        headLine.setBounds( 175, 50, 450, 200 );

        cardNumber = new JLabel( "Card No:" );
        cardNumber.setFont( new Font( "Raleway", Font.BOLD, 28 ) );
        cardNumber.setBounds( 125, 150, 375, 200 );

        pin = new JLabel( "PIN:" );
        pin.setFont( new Font( "Raleway", Font.BOLD, 28 ) );
        pin.setBounds( 125, 250, 375, 200 );

        cardNumberEnter = new JTextField( 15 );
        cardNumberEnter.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        cardNumberEnter.setBounds( 300, 235, 230, 30 );


        enterPin = new JPasswordField( 15 );
        enterPin.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        enterPin.setBounds( 300, 335, 230, 30 );

        signIn = new JButton( "SIGN IN" );
        signIn.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        signIn.setBounds( 300, 400, 100, 30 );
        signIn.setBackground( Color.BLACK );
        signIn.setForeground( Color.WHITE );

        clear = new JButton( "CLEAR" );
        clear.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        clear.setBounds( 430, 400, 100, 30 );
        clear.setBackground( Color.BLACK );
        clear.setForeground( Color.WHITE );

        signUp = new JButton( "SIGN UP" );
        signUp.setFont( new Font( "Arial", Font.BOLD, 14 ) );
        signUp.setBounds( 300, 450, 230, 30 );
        signUp.setBackground( Color.BLACK );
        signUp.setForeground( Color.WHITE );


        add( headLine );
        add( cardNumber );
        add( pin );
        add( cardNumberEnter );
        add( enterPin );
        add( signIn );
        add( clear );
        add( signUp );

    }
    public static void main(String[] args) {
        new Login().setVisible( true );
    }
}
