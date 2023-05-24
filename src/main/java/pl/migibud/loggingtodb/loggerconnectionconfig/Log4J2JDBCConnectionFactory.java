package pl.migibud.loggingtodb.loggerconnectionconfig;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Log4J2JDBCConnectionFactory {
    private HikariDataSource dataSource ;
    private HikariConfig config ;
    private interface Singleton {
        final Log4J2JDBCConnectionFactory INSTANCE = new Log4J2JDBCConnectionFactory();
    }

    private  Log4J2JDBCConnectionFactory()   {
        config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3310/logging_schema");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setUsername("root");
        config.setPassword("root");
        config.setMaximumPoolSize(10);
        dataSource = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return Singleton.INSTANCE.dataSource.getConnection();
    }
}
