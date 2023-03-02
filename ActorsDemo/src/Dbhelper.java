import java.sql.*;

public class Dbhelper {
   
    private String userName="root";
    private String password="3289700";
    private String dbUrl="jdbc:mysql://localhost:3306/sakila";
    
    public Connection getConnection() throws SQLException{
    
        return DriverManager.getConnection(dbUrl,userName,password);
        
    }
    
    public void showErrorMessage(SQLException exception){ 
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error code: "+exception.getErrorCode());
        
    }
}
