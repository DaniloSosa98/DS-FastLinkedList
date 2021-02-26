
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

    public static void main(String[] args) {
        
        FastLinkedList f  =  load();
        f.displayList();
        //f.references();
        //f.printLevels();
        
    }

    public static FastLinkedList load() {
        Connection con = null; //create a Connection variable
        FastLinkedList c_array = new FastLinkedList();
        String un = "root";
        String pw = "";
        String url = "jdbc:mysql://localhost/classicmodels";

        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //create connection
            con = DriverManager.getConnection(url, un, pw);

            System.out.println("SUCCESS");

            //create a statement object
            Statement s = con.createStatement();
            //String query = "SELECT * FROM customers;";
            String query = "SELECT * FROM customers ORDER BY customerName DESC";
            s.executeQuery(query);
            ResultSet rs = s.getResultSet();

            int count = 0;

            while (rs.next()) {
                Customer c = new Customer(rs.getInt("customerNumber"), rs.getString("customerName"),
                        rs.getString("contactLastName"), rs.getString("contactFirstName"), rs.getString("phone"),
                        rs.getString("addressLine1"), rs.getString("addressLine2"), rs.getString("city"), rs.getString("state"),
                        rs.getString("postalCode"), rs.getString("country"), rs.getInt("salesRepEmployeeNumber"), rs.getDouble("creditLimit"));
                
                c_array.insertFirst(c);
                count++;
            }

        } catch (Exception e) {
            System.err.println("Something bad happened: " + e.getMessage());
        }

        return c_array;
    }

}
