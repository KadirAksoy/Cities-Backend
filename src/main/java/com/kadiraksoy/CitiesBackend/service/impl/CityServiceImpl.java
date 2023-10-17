package com.kadiraksoy.CitiesBackend.service.impl;

import com.kadiraksoy.CitiesBackend.dto.CityDto;
import com.kadiraksoy.CitiesBackend.exception.ApplicationException;
import com.kadiraksoy.CitiesBackend.mapper.GenericMapper;
import com.kadiraksoy.CitiesBackend.model.City;
import com.kadiraksoy.CitiesBackend.repository.CityRepository;
import com.kadiraksoy.CitiesBackend.service.CityService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final GenericMapper genericMapper;
    private final ModelMapper modelMapper;

    @Override
    public void readAndSaveCsvFile(String csvFileName) {
        try{
            InputStream inputStream = getClass().getResourceAsStream("/" + csvFileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            CSVParser csvParser = new CSVParser(inputStreamReader,
                    CSVFormat
                            .DEFAULT
                            .withFirstRecordAsHeader()
                            .withIgnoreHeaderCase()
                            .withTrim());

            List<City> cities = new ArrayList<>();

            for (CSVRecord record : csvParser) {
                City City = new City();
                City.setId(Long.valueOf(record.get("id")));
                City.setName(record.get("name"));
                City.setPhoto(record.get("photo"));
                cities.add(City);
            }

            cityRepository.saveAll(cities);
            csvParser.close();

        }catch (IOException e){
            throw new ApplicationException(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage());
        }


    }

    @Override
    public Page<CityDto> getCities(int pageNo, int pageSize, String sortBy, String sortDir) {
        return null;
    }

    @Override
    public Page<CityDto> findCitiesByName(int pageNo, int pageSize, String sortBy, String sortDir, String name) {
        return null;
    }

    @Override
    public CityDto updateCity(CityDto dto) {
        return null;
    }


}
