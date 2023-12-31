package com.tobeto.spring.b.services.dtos.requests.city;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCityRequest {
    @NotBlank(message = "You need to specify a city")
    private String name;
}
