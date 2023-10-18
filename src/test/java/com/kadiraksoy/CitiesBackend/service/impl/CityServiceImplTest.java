package com.kadiraksoy.CitiesBackend.service.impl;

import com.kadiraksoy.CitiesBackend.dto.CityDto;
import com.kadiraksoy.CitiesBackend.mapper.GenericMapper;
import com.kadiraksoy.CitiesBackend.model.City;
import com.kadiraksoy.CitiesBackend.repository.CityRepository;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.*;

import java.io.InputStream;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

class CityServiceImplTest {
    @Mock
    private CityRepository cityRepository;

    @Mock
    private GenericMapper genericMapper;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private CityServiceImpl cityService;
    private City city;


    @BeforeEach
    public void setup() {
        city = City.builder()
                .id(1L)
                .name("Gaziantep")
                .photo("http://cities.com/gaziantep.jpeg")
                .build();
    }





}