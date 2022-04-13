package ro.fasttrackit.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.model.CountryDetails;
import ro.fasttrackit.repository.CountryDetailsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CountryDetailsService {

    private CountryDetailsRepository countryDetailsRepository;

    public CountryDetailsService(CountryDetailsRepository countryDetailsRepository) {
        this.countryDetailsRepository = countryDetailsRepository;
    }

    public List<CountryDetails> getCountryDetails(){
        return countryDetailsRepository.findAll();
    }

    public CountryDetails addCountryDetails(CountryDetails countryDetails){
        return countryDetailsRepository.save(countryDetails);
    }

    public CountryDetails replaceCountryDetails(int id,CountryDetails countryDetails){
        return countryDetailsRepository.save(countryDetails);

    }


    public Optional<CountryDetails> getCountryDetails(Integer countryId) {
        return countryDetailsRepository.findById(countryId);
    }
}
