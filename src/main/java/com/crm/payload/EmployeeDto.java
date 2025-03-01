package com.crm.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class EmployeeDto {
    private Long id;

    @NotBlank
    @Size(min = 3, message = "At Least  3 chars required")
    private String name;

    @Email
    private String emailId;

    @Size(min = 10, max = 10, message = "Should be 10 digits")
    private String mobile;


}
