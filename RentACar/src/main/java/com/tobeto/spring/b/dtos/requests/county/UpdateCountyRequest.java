package com.tobeto.spring.b.dtos.requests.county;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCountyRequest {
    private String name;
}
