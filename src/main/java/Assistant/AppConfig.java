package Assistant;

import Service.*;
import org.springframework.context.annotation.*;

@Configuration // oznacza, ze beda tutaj komponenty springowe @Bean
@PropertySource("classpath:app.properties")
@Import(DatabaseConfig.class)
public class AppConfig {

    @Bean
    @Primary
    public FileCurrencyRateProvider fileCurrencyRateProvider() {
        return new FileCurrencyRateProvider();
    }

    @Bean

    public DatabaseCurrencyRateProvider dataBaseCurrencyRateProvider() {
        return new DatabaseCurrencyRateProvider();
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
