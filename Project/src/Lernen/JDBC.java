package Lernen;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.rmi.server.ExportException;
import java.sql.*;

public class JDBC {
    Connection con;
    Statement st;
    ResultSet rs;

    public void treiberLaden(){
        try{
            Class.forName("org.postgresql.Driver");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void verbindungAufbauen(){

        try{
            con = DriverManager.getConnection("pfad der datenbank","username","123");


        }catch(SQLException e ){
            e.printStackTrace();
        }
    }
    public void anweisungEins(){
        String hakan = "Hakan";
        hakan = ";SET ADMIN USER = 5;";
        try {
           st = con.createStatement();
            st.executeQuery("SELECT * FROM "+hakan+" WHERE mineralwasser = 5;");
        }catch (SQLException s){
            s.printStackTrace();
        }finally{
            try{
                if(st!=null){
                    st.close();
                }
            }catch(Exception e ){
                e.printStackTrace();
            }
        }
    }
    public void anweisungZwei(){
        try{
            PreparedStatement ps = con.prepareStatement("SELECT ? FROM ? WHERE hakan = ?");
            ps.setString(1,"mineralwasser");
            ps.setString(2,"Sefa");
            ps.setString(3,"nett");
            //noch nicht am Datenbank! erst wenn ps.executeUpdate() ausgeführt wurde(ohne parameter werte))

        }catch(SQLException s){
            s.printStackTrace();
        }
    }
    public void anweisungDrei(){
        try(CallableStatement cs = con.prepareCall("SQL BEFEHL")){
            cs.executeUpdate("INSERT INTO hakan ..");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void ergebnisBekommen(){
        try{
            //result set
            rs = st.executeQuery("SELECT * FROM hakanTabelle");
          System.out.print(rs.getFloat(5));

        }catch(SQLException e){
            e.printStackTrace();
        }
    }


}
