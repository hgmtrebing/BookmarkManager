package us.hgmtrebing.bookmarkmanager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SampleDbInitializer {

  public void initializeSampleSchema() throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:~/test");
  }
}
