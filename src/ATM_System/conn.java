/*   Created by IntelliJ IDEA.
 *   Author:  Kirtiman Singh
 *   Date: 9/25/2020
 *   Time: 10:30 PM
 *   File: conn.java
 */

package ATM_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            c = DriverManager.getConnection( "jdbc:mysql:///project1", "root", "" );
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println( e );
        }

    }
}
