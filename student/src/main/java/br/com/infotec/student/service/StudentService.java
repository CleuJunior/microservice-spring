package br.com.infotec.student.service;

import br.com.infotec.student.api.dto.StudentRequest;
import br.com.infotec.student.api.dto.StudentResponse;
import br.com.infotec.student.model.Student;
import br.com.infotec.student.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentResponse saveStudent(StudentRequest request) {
        Student student = Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .schoolId(request.schoolId())
                .build();

        log.info("Student {} save succefully" , student);
        repository.save(student);
        return new StudentResponse(student);
    }

    public List<StudentResponse> findAllStudents() {
        log.info("List of student");

        return repository.findAll().stream()
                .filter(Objects::nonNull)
                .map(StudentResponse::new)
                .toList();
    }

}
