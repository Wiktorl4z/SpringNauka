package Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class SecondRateConversionService {

    private CurrencyRateProvider rateProvider;

    @Autowired
    public void setRateProvider(CurrencyRateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }

    public BigDecimal convertAmount(BigDecimal amount, String currency) {
        BigDecimal rate = rateProvider.getRate(currency, new Date());
        System.out.println("HashCode: " +hashCode());
        System.out.println("Service.SecondRateConversionService: Obliczam kwote");
        BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        return result;
    }
}
