package br.com.infotec.school.api.dto;

import java.util.List;

public record FullSchoolResponse(
        String name,
        String email,
        List<Student> students
) { }
