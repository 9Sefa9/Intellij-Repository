package DatabankStrategies;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC implements DatabankStrategy{
    Connection con;
    Statement st;
    PreparedStatement ps;
    CallableStatement cs;
    ResultSet rs;

    @Override
    public void setupDriver() {
        try{
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setupConnection() {
        try{
            con = DriverManager.getConnection("C:/Users/Sefa/desktop/SQLite/Library.dbd");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public void query() {
        try{
            //nicht SQL sicher:
            st = con.createStatement();
            st.executeQuery("");

            //SQL sicher:
            ps = con.prepareStatement("INSERT ? INTO Tabelle");
            ps.setFloat(1, 12345);
            ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                this.con.close();
            }catch(SQLException e ){
                    e.printStackTrace();
            }
        }
    }
    @Override
    public void fetch() {
        try {
            //CachedRowSet kann sowohl, query+update+Daten wiedergeben.
            //RowSet erbt von ResultSet
           RowSetFactory rsf = RowSetProvider.newFactory();
           try(CachedRowSet crs = rsf.createCachedRowSet()){
               crs.setCommand("SELECT * FROM Library");
               crs.execute();
               while(crs.next()){
                   System.out.println(crs.getInt("id"));
                   System.out.println(crs.getString("title"));
                   System.out.println(crs.getString("artist"));
                   System.out.println(crs.getString("album"));
                   System.out.println(crs.getString("path"));
               }
           }
        }catch(SQLException e ){
            e.printStackTrace();

        }finally{
            try{
                this.con.close();
            }catch(SQLException e ){
                e.printStackTrace();
            }
        }
    }
}
