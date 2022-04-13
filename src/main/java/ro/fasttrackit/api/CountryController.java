package ro.fasttrackit.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.model.CountryDetails;
import ro.fasttrackit.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("api/countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping
    public List<Country> getCountries(){
        return countryService.getCountries();
    }

    @PostMapping
    Country addCountry(@RequestBody Country country){
        return countryService.addCountry(country);
    }

    @PutMapping("{id}")
    Country replaceCountry (@PathVariable int id,@RequestBody Country country){
        return countryService.replaceCountry(id,country);
    }

    @DeleteMapping(path = "{id}")
    Country deleteCountry(@PathVariable int id){
        return countryService.deleteCountry(id).orElse(null);
    }


}
