
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Conexao {
   
       
public Connection conectaBD(){
           Connection conect = null;
           try{
               String url = "jdbc:mysql://localhost:3306/login?createDatabaseIfNotExist=true";
               String user = "root";
               String password = "12345678";
               conect = DriverManager.getConnection(url,user,password);
           }catch(SQLException erro){
               JOptionPane.showMessageDialog(null, erro.getMessage());
           }
           return conect;  
       }
    }

