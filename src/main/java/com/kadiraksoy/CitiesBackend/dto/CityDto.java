package com.kadiraksoy.CitiesBackend.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CityDto {

    private Long id;
    private String name;
    private String photo;
}
