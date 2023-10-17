package com.kadiraksoy.CitiesBackend.repository;

import com.kadiraksoy.CitiesBackend.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

    Page<City> findByNameContainingIgnoreCase(String name, Pageable pageable);
}

