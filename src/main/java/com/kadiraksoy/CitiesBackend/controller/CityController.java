package com.kadiraksoy.CitiesBackend.controller;

import com.kadiraksoy.CitiesBackend.dto.CityDto;
import com.kadiraksoy.CitiesBackend.service.CityService;
import com.kadiraksoy.CitiesBackend.utils.AppConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/cities")
    public ResponseEntity<Page<CityDto>> getCities(
            @RequestParam(
                    value = "pageNo",
                    defaultValue = "3",
                    required = false)
            int pageNo,
            @RequestParam(
                    value = "pageSize",
                    defaultValue = AppConstants.DEFAULT_PAGE_SIZE,
                    required = false)
            int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false)
            String sortBy,
            @RequestParam(
                    value = "sortDir",
                    defaultValue = AppConstants.DEFAULT_SORT_DIRECTION,
                    required = false)
            String sortDir) {
        return ResponseEntity.ok(cityService.getCities(pageNo, pageSize, sortBy, sortDir));
    }
}
