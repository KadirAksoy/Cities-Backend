package com.kadiraksoy.CitiesBackend.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenericMapper {

    public <S,T> List<T> mapList(List<S> source, Class<T> targetClass){
        return source
                .stream()
                .map(x -> new ModelMapper().map(x,targetClass))
                .collect(Collectors.toList());
    }

    public <D,T> Page<D> mapPage(Page<T> entities,Class<D> targetDtoClass){
        return entities.map(x -> new ModelMapper().map(x,targetDtoClass));

    }
}
