package com.hospital.hospital_demo_api.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PatientRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    private Long patientId;
    private Date createdDate = new Date();
    private String diagnostics;
    private String observations;
    private String treatments;
    private Long departmentId;
    private String misc;
}
