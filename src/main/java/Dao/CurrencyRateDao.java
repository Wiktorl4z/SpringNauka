package Dao;

import DTO.CurrencyRate;

import java.math.BigDecimal;
import java.util.Date;

public interface CurrencyRateDao {

BigDecimal getRate(String currency, Date rateDate);
CurrencyRate getRateInfo(String currency, Date rateDate);
}
