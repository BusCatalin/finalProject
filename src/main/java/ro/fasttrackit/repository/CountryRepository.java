package ro.fasttrackit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
