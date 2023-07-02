package com.test.JobSearchPortal.model;

import com.test.JobSearchPortal.model.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {
    @Id
    private  Long id;
    @NotEmpty
    private String title;
    private String description;
    private String location;
    @Size(min=20000, message = "criteria not find")
    private Double salary;
    @Email
    private String companyEmail;
    @NotEmpty
    private String companyName;
    private String employerName;
    private Type jobType;
}
