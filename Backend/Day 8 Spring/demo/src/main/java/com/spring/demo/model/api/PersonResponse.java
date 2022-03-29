package com.spring.demo.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonResponse {

    @Schema(description = "Person first name", example = "Mantas")
    private String firstName;
    @Schema(description = "Person last name", example = "Ambrazaitis")
    private String lastName;
    @Schema(description = "Person email", example = "email@gmail.com")
    private String email;
    @Schema(description = "Person phone number", example = "+37067878787")
    private String phone;


}
