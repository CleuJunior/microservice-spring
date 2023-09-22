package br.com.infotec.student.api.dto;

import br.com.infotec.student.model.Student;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public record StudentResponse(
        Integer id,
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {
    public StudentResponse(Student student) {
        this(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getSchoolId()
        );
    }
}
