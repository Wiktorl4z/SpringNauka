package Assistant;

import Dao.CurrencyRateDao;
import Dao.JdbcCurrencyRateDao;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        BasicDataSource source = new BasicDataSource();
        source.setUrl("jdbc:mysql://localhost:3306/auto_mobile?autoReconnect=true&useSSL=false");
        System.out.println("Connected to the database");
        source.setUsername("root");
        System.out.println("Root accepted");
        source.setPassword("password");
        System.out.println("Password accepted");

        return source;

    }

       /* BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("org.h2.Driver");
        source.setUrl("jdbc:h2:~/springtutorial;INIT=runscript from 'classpath:/create.sql'");
        source.setUsername("SA");
        return source;*/


    @Bean
    public CurrencyRateDao currencyRateDao() {
        return new JdbcCurrencyRateDao();
    }
}
