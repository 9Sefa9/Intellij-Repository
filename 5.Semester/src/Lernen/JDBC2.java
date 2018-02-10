package Lernen;

import java.sql.*;
public class JDBC2 {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public static void main(String[] a){
        new JDBC2();
    }
    public void loadDriverSchritt1(){
        try{
        Class.forName("org.sqlite.JDBC");
        }catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
    public void createConnectionSchritt2(){
        try {
            con = DriverManager.getConnection("C:/Users/Sefa/Desktop/SQLite/irgendeine.db");

        }catch(SQLException s){
            s.printStackTrace();
        }

    }
    public void createStatementINTOSchritt3bzw4(){
            try{
                //Prepared Statement, welches elemente in der tabelle VERÄNDERN
                ps = con.prepareStatement("INSERT INTO ? (?,?) VALUES(?,?)");
                ps.setString(1,"Tabelle");
                ps.setString(2,"Name");
                ps.setString(3,"Wohnort");
                ps.setString(4,"Sefa");
                ps.setString(5,"Leverkusen")
                ps.executeUpdate();
//--------------------------------------------------------------------------------------------------

                //Prepared Statement,welches informationen rausfischt und sie abspeichert in eine ResultSet
                ps = con.prepareStatement("SELECT ? FROM ? WHERE name = ?");
                ps.setString(1,"Spalte");
                ps.setString(2,"Tabelle");
                ps.setString(3,"zeilenName");

                //speichere alle infos, nach der ausführung von executeQuery(), in die Menge rs
                rs = ps.executeQuery();
                while(rs.next()){
                   String zeilenName =  rs.getString("name"); //name = "Spalte"
                }

            }catch(SQLException s){
                s.printStackTrace();
            }
    }
}
