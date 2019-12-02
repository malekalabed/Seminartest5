import java.sql.DriverManager;
import java.sql.*;

public class DB_Connector {


    String url = "jdbc:mysql://127.0.0.1:3306/world?user=root&password=root&useSSL=false";

    Statement statement;

    public DB_Connector() {
        try {
            Connection c = (Connection) DriverManager.getConnection(url);
            statement = c.createStatement();
        } catch (SQLException ex) {
            System.out.println("the connection fails");
        }
    }

    public void searchForCountry(String name) {
        try {
//            ResultSet rs = statement.executeQuery("SELECT name, population FROM city WHERE name ='" + name + "'");
            ResultSet rs = statement.executeQuery("SELECT * FROM city");

            while (rs.next()) {
                System.out.println(" The country " + rs.getString(1) + " is in the database and the Capital is " + rs.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println("error on executing the query from searchForCountry");
        }
    }
    public void Dropcolumn() {
        try {
            statement.executeUpdate("ALTER TABLE country CHANGE COLUMN `IndepYear` `YearofIndep` smallint(6) NULL;");

        } catch (SQLException ex) {
            System.out.println(" error on executing the query Dropcolumn ");
        }
    }
}
