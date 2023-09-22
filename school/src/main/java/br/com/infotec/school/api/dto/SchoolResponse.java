package br.com.infotec.school.api.dto;

import br.com.infotec.school.model.School;

public record SchoolResponse(
        Integer id,
        String name,
        String email
) {
    public SchoolResponse(School school) {
        this(
                school.getId(),
                school.getName(),
                school.getEmail()
        );
    }
}
