import persistance.DomainReader;
import persistance.SQLiteDomainReader;

import java.io.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Gabriel on 27/10/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        DomainReader domainReader = new SQLiteDomainReader();
        List<String> mailList = domainReader.getDomains();
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).setVisible(true);
    }
}
