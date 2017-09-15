package Assistant;

import Service.FileCurrencyRateProvider;
import Service.RateConversionService;
import Service.SecondRateConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // oznacza, ze beda tutaj komponenty springowe @Bean
public class AppConfig {

    @Bean
    public FileCurrencyRateProvider fileCurrencyRateProvider() {
        return new FileCurrencyRateProvider();
    }

    @Bean
    public RateConversionService rateConversionService() {
        RateConversionService rateConversionService = new RateConversionService();
        return rateConversionService;
    }

    @Bean
    public SecondRateConversionService secondRateConversionService() {
        SecondRateConversionService rateConversionService = new SecondRateConversionService();
        return rateConversionService;
    }
}
