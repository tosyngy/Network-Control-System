
package networkcontrolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class DbConnect {

    public Connection con;
    public ResultSet rs;
    public PreparedStatement ps;
    public Statement st;
    JOptionPane jp;

    public DbConnect() {
        jp = new JOptionPane();
        GetIP ip;
        String dbIP="localhost";
        try {
             System.out.println("Your connection ip is "+dbIP );
            String url = "jdbc:mysql://"+ dbIP+":3306/";
            String dbName = "access_control";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                st = con.createStatement();
               rs=st.executeQuery("Select ip from server_ip");
                if(rs.next()){
               dbIP= rs.getString("ip");
                }
                //System.out.println("Connected to the database");
            } catch (Exception e) {
                int chk = jp.showConfirmDialog(null, "Connection Off: Click Yes to Reconnect\nIf you are rounning on localhost\nMake sure server has been started", "RE-CONNECT", jp.YES_NO_CANCEL_OPTION);
                if (chk == 0) {
                    new DbConnect();
                } else {
                    System.exit(0);
                }
            }
            
//            ip= new GetIP();
//             dbIP=ip.getServerIp();
//            if(!dbIP.isEmpty()){
//            dbIP=ip.getServerIp();
//            }else{
//            dbIP=ip.getRealIp();
//            }
            System.out.println("Your connection ip is "+dbIP );
             url = "jdbc:mysql://"+ dbIP+":3306/";
             dbName = "access_control";
             driver = "com.mysql.jdbc.Driver";
             userName = "root";
             password = "";
            try {
                Class.forName(driver).newInstance();
                con = DriverManager.getConnection(url + dbName, userName, password);
                st = con.createStatement();
                //System.out.println("Connected to the database");
            } catch (Exception e) {
                int chk = jp.showConfirmDialog(null, "Connection Off: Click Yes to Reconnect\nIf you are rounning on localhost\nMake sure server has been started", "RE-CONNECT", jp.YES_NO_CANCEL_OPTION);
                if (chk == 0) {
                    new DbConnect();
                } else {
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            //System.out.println("connector Error  " + e);
        }

    }
//
//    public static void main(String[] args) {
//        new DbConnect();
//    }
}
