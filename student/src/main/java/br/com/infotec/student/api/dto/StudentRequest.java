package br.com.infotec.student.api.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record StudentRequest(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) { }
