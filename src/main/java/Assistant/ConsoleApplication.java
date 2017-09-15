package Assistant;

import Service.RateConversionService;
import Service.SecondRateConversionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class ConsoleApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RateConversionService service = context.getBean(RateConversionService.class);
        service.convertAmount(BigDecimal.valueOf(123.00), "EUR");

        SecondRateConversionService secondService = context.getBean(SecondRateConversionService.class);
        secondService.convertAmount(BigDecimal.valueOf(123.00), "EUR");
    }
}
