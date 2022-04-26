package ro.fasttrackit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.model.Country;
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
                    new Country("Japan", "Asia","Tokyo",377975,"Japanese yen"),
                    new Country("Germany", "Europe","Berlin",357022,"Euro"),
                    new Country("Egypt","Africa","Cairo",1010408,"Egyptian pound"),
                    new Country("Brazil","South America","Brasilia",8515767,"Real")

			));
        };
    }

}
