package Assistant;

import Service.*;
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

    @Bean
    public RoundPrecisionProvider roundPrecisionProvider(){
        return new FixedPrecisionProvider();
    }

    @Bean
    public RoundPrecisionProvider roundJpyPrecisionProvider(){
        return new JpyPrecisionProvider();
    }
}
