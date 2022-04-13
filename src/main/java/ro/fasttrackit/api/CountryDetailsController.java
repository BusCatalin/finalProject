package ro.fasttrackit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.model.CountryDetails;
import ro.fasttrackit.service.CountryDetailsService;

import java.util.List;

@RestController
public class CountryDetailsController {

    private final CountryDetailsService countryDetailsService;

    public CountryDetailsController(CountryDetailsService countryDetailsService) {
        this.countryDetailsService = countryDetailsService;
    }

    @GetMapping
    public List<CountryDetails> getCountryDetails(){
        return countryDetailsService.getCountryDetails();
    }

    @PostMapping
    CountryDetails addCountryDetails(@RequestBody CountryDetails countryDetails){
        return addCountryDetails(countryDetails);
    }
}
