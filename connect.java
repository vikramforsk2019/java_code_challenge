    import java.sql.*;  
    class connect{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/sonoo","root","");  
    //here sonoo is database name, root is username and password  
    System.out.println("okkkk");
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
 System.out.println("okkkk");
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    }  
    }  