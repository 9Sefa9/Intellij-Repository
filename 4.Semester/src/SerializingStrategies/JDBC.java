package SerializingStrategies;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC {
    Connection con;
    Statement st;
    ResultSet rs;
    public void DriverLoading(){
        try{
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void ConnectToDatabank(){
        try{
            con = DriverManager.getConnection("PathToSql");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void createAndSendStatement(){
        try{
            con = DriverManager.getConnection("ddd");
            st = con.createStatement();
            st.executeUpdate("sql");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getResults(){
        try{

            RowSetFactory rsf = RowSetProvider.newFactory();
            try(CachedRowSet crs = (CachedRowSet)rsf.createCachedRowSet()){
                crs.setTableName("hi");
                crs.setUsername("HII2");
                crs.execute();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
