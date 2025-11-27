package br.eti.alml.airports.repositories;

import br.eti.alml.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository <Airport, Long> {
    
    List<Airport> findByCityIgnoreCase(String city);
    
}
