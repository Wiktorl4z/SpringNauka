package Dao;

import DTO.CurrencyRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JdbcCurrencyRateDao implements CurrencyRateDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public BigDecimal getRate(String currency, Date rateDate) {
        return jdbcTemplate.queryForObject("select rate from currency_rates where curreny=? and rate_date = ?",
                new Object[]{currency, new java.sql.Date(rateDate.getTime())}, BigDecimal.class);

    }

    public CurrencyRate getRateInfo(String currency, Date rateDate) {
        return jdbcTemplate.queryForObject("select * from currency_rates where curreny=? and rate_date = ?",
                new Object[]{currency, new java.sql.Date(rateDate.getTime())},
                new RowMapper<CurrencyRate>() {
                    public CurrencyRate mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new CurrencyRate(resultSet.getString("CURRENCY"),resultSet.getDate("RATE_DATE"), resultSet
                                .getBigDecimal("RATE"));
                    }
                });
    }
}
