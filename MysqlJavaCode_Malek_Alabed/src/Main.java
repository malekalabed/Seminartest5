public class Main {

    public static void main(String[] args) {
        DB_Connector connection = new DB_Connector();
        connection.searchForCountry("united states");
        connection.Dropcolumn();
    }
}

