package Service;

import DTO.CurrencyRate;
import Dao.CurrencyRateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class DatabaseCurrencyRateProvider implements CurrencyRateProvider {

    @Autowired
    private CurrencyRateDao currencyRateDao;


    public BigDecimal getRate(String currency, Date rateDate) {
        BigDecimal rate = currencyRateDao.getRate(currency, rateDate);

        CurrencyRate currencyRate = currencyRateDao.getRateInfo(currency, rateDate);
        System.out.println("Currency Rate " + currencyRate.toString());

        System.out.println("DatabaseCurrencyRateProvider: Wczytano kursy z bazy danych, kurs= " + rate);
        return rate;
    }

    public void getName() {
        System.out.println("Co kolwiek");
    }
}
