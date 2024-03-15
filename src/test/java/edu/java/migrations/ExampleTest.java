package edu.java.migrations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest extends IntegrationEnvironment {
    private final String SQL_INSERT = "INSERT INTO link (link,type_id,checked_date) VALUES ('https://sample/link', 1, now())";

    @Test
    public void sampleTest() throws Exception {
        Connection connection =
            DriverManager.getConnection(POSTGRES.getJdbcUrl(), POSTGRES.getUsername(), POSTGRES.getPassword());
        Statement statement = connection.createStatement();
        statement.execute(SQL_INSERT);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM link");

        String actualUrl = null;
        while (resultSet.next()) {
            actualUrl = resultSet.getString("link");
        }

        assertThat(actualUrl).isEqualTo("https://sample/link");
    }

}
