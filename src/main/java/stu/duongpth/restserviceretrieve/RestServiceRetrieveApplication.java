package stu.duongpth.restserviceretrieve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import stu.duongpth.restserviceretrieve.domain.Customer;
import stu.duongpth.restserviceretrieve.domain.Quote;

@SpringBootApplication
public class RestServiceRetrieveApplication {

    private static final Logger log = LoggerFactory.getLogger(RestServiceRetrieveApplication.class);

    public static void main(String args[]) {
        SpringApplication.run(RestServiceRetrieveApplication.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = (Quote) restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            log.info(quote.toString());

//            ResponseEntity<Customer> entity = restTemplate.getForEntity("http://127.0.0.1:8080/customers/all", Customer.class);
        };
    }
}
