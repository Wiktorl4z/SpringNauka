package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class FileCurrencyRateProvider implements CurrencyRateProvider {

    @Autowired
    private Environment environment;

public BigDecimal getRate(String currency, Date rateDate){
    String fileName = environment.getProperty("filename");
    System.out.println("Service.FileCurrencyRateProvider: Wczytano kursy z pliku lokalnego " + fileName);
    return BigDecimal.valueOf(4.25);
}

    public void getName() {

    }
}
