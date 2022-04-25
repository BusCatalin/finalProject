package ro.fasttrackit.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;


    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Optional<Country> deleteCountry(int id) {
        Optional<Country> countryToDelete= countryRepository.findById(id);
        countryToDelete.ifPresent(countryRepository::delete);
        return countryToDelete;
    }

    public Optional<Country> getCountry(Integer id) {
        return countryRepository.findById(id);
    }

    public Country replaceCountry(int id, Country country) {
        country.setId(id);
        return countryRepository.save(country);
    }
}
