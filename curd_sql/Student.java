import java.sql.*;

public class Student {
    
    public static void create() {
        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:student.db");
            System.out.println("Creating database");
            
            stmt = c.createStatement();
            String sql = "CREATE TABLE STUDENT" + "(ID INT PRIMARY KEY NOT NULL," + "NAME TEXT NOT NULL," + "AGE INT NOT NULL);";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }
    
    public static void read() {
        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:student.db");
            c.setAutoCommit(false);
            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT;");
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "AGE = " + age );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch(Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        
    }
    
    public static void insert() {

        
          Connection c = null;
          Statement stmt = null;

          try {
             Class.forName("org.sqlite.JDBC");
             c = DriverManager.getConnection("jdbc:sqlite:student.db");
             c.setAutoCommit(false);

             stmt = c.createStatement();
             String sql = "INSERT INTO STUDENT (ID,NAME,AGE) " +
                            "VALUES (1, 'Paul', 32);"; 
             stmt.executeUpdate(sql);

             sql = "INSERT INTO STUDENT (ID,NAME,AGE) " +
                      "VALUES (2, 'Allen', 25);"; 
             stmt.executeUpdate(sql);

             sql = "INSERT INTO STUDENT (ID,NAME,AGE) " +
                      "VALUES (3, 'Teddy', 23);"; 
             stmt.executeUpdate(sql);

             stmt.close();
             c.commit();
             c.close();
           } catch ( Exception e ) {
             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
             System.exit(0);
          }
          System.out.println("Records created successfully");
    }
    
    public static void update() {
        
        Connection c = null;
       Statement stmt = null;

       try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:student.db");
          c.setAutoCommit(false);
          System.out.println("Opened database successfully");

          stmt = c.createStatement();
          String sql = "UPDATE STUDENT set AGE = 23 where ID=1;";
          stmt.executeUpdate(sql);
          c.commit();

          ResultSet rs = stmt.executeQuery( "SELECT * FROM STUDENT;" );

          while ( rs.next() ) {
             int id = rs.getInt("id");
             String  name = rs.getString("name");
             int age  = rs.getInt("age");

             System.out.println( "ID = " + id );
             System.out.println( "NAME = " + name );
             System.out.println( "AGE = " + age );
             System.out.println();
          }
          rs.close();
          stmt.close();
          c.close();
       } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
       }
        System.out.println("Operation update done successfully");
       }

    public static void delete() {
        
          Connection c = null;
          Statement stmt = null;

          try {
             Class.forName("org.sqlite.JDBC");
             c = DriverManager.getConnection("jdbc:sqlite:student.db");
             c.setAutoCommit(false);
             System.out.println("Opened database successfully");

             stmt = c.createStatement();
             String sql = "DELETE from STUDENT where ID=2;";
             stmt.executeUpdate(sql);
             c.commit();
             System.out.println();
             stmt.close();
          c.close();
          } catch ( Exception e ) {
             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
             System.exit(0);
          }
          System.out.println("Operation delete done successfully");
       }
    
    public static void main (String[] args) {
        create();
        insert();
        read();
        update();
        delete();
        read();
    }
}
