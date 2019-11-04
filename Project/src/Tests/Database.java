package Tests;

import java.sql.*;

public class Database {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("org.sqlite.JDBC");

            Connection con = DriverManager.getConnection("jdbc:sqlite:G:/User..");

            PreparedStatement ps = con.prepareStatement("INSERT INTO * FROM ? WHERE test = ?");
            ps.setString(1,"testArea");
            ps.setInt(2,10);
            ps.executeUpdate();

            PreparedStatement pstmnt = con.prepareStatement("SELECT * FROM testArea WHERE test = 10");
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("test"));
            }
        }catch(SQLException s){
            s.printStackTrace();
        }
    }
}
