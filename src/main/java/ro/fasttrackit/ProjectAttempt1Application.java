package ro.fasttrackit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.model.CountryDetails;
import ro.fasttrackit.repository.CountryRepository;

import java.util.List;

@SpringBootApplication
public class ProjectAttempt1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectAttempt1Application.class, args);
    }

    @Bean
    CommandLineRunner atStartUp(CountryRepository countryRepository) {
        return args -> {
            countryRepository.saveAll(List.of(
                    new Country("Japan", "Asia",new CountryDetails("Tokyo",125472536,"Japanese yen")),
                    new Country("Germany", "Europe",new CountryDetails("Berlin",83190556,"Euro"))

			));
        };
    }

}
