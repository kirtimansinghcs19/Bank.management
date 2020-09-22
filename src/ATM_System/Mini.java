/*   Created by IntelliJ IDEA.
 *   Author:  Kirtiman Singh
 *   Date: 9/22/2020
 *   Time: 8:52 PM
 *   File: Mini.java
 */

package ATM_System;

import javax.swing.*;

public class Mini extends JFrame {
    JTable t1;
    JButton b1;
    String x[] = {"Customer Name", "Date", "Deposit", "Withdraw", "Balance"};
    String y[][] = new String[20][5];
    int i = 0, j = 0;

    Mini() {
        super( "Mini Statement" );
        setSize( 1200, 650 );
        setLocation( 200, 200 );
        String pinn = JOptionPane.showInputDialog( "Enter PIN" );


        b1 = new JButton( "Print" );
        add( b1, "South" );
        JScrollPane sp = new JScrollPane( t1 );
        add( sp );

    }

    public static void main(String[] args) {
        new Mini().setVisible( true );
    }
}
