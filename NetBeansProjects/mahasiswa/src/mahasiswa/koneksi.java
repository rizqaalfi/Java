/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import java.sql.*;
/**
 *
 * @author Acer
 */
public final class koneksi {
    public static Connection con;
     //  public static Statement stm;
     public koneksi() throws SQLException{
       bukaKoneksi();
    }
    public Connection bukaKoneksi() throws SQLException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/toko", "root","");
           // stm = con.createStatement();
           System.out.println("successed connection");
            return con;
        }
        catch (SQLException se){
            System.out.println("No connection open");
            return null;
        }
         catch (Exception ex){
            System.out.println("Count not open connection");
            return null;
        }
        
    }
    
    
    public static void main(String[] args)throws SQLException {
        koneksi x = new koneksi();
        System.out.println(x);
    }
    
   
}
