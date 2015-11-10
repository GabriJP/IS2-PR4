package persistance;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by usuario on 10/11/2015.
 */
public class SQLiteDomainReader implements DomainReader {

    private final Connection connection;

    public SQLiteDomainReader() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:People");
    }

    @Override
    public List<String> getDomains() {
        try {
            List<String> domains = new LinkedList<>();
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM mail");
            while (resultSet.next()){
                domains.add(resultSet.getString(2));
            }
            connection.close();
            return domains;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
