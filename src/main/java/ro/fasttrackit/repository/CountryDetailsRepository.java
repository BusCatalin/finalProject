package ro.fasttrackit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.model.Country;
import ro.fasttrackit.model.CountryDetails;

@Repository
public interface CountryDetailsRepository extends JpaRepository<CountryDetails,Integer> {
}
