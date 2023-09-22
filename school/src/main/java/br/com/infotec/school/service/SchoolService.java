package br.com.infotec.school.service;

import br.com.infotec.school.api.dto.FullSchoolResponse;
import br.com.infotec.school.api.dto.SchoolRequest;
import br.com.infotec.school.api.dto.SchoolResponse;
import br.com.infotec.school.api.dto.Student;
import br.com.infotec.school.client.StudentClient;
import br.com.infotec.school.model.School;
import br.com.infotec.school.repository.SchoolRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class SchoolService {
    private final SchoolRepository repository;
    private final StudentClient client;

    public SchoolService(SchoolRepository repository, StudentClient client) {
        this.repository = repository;
        this.client = client;
    }

    public SchoolResponse saveSchool(SchoolRequest request) {
        School school = School.builder()
                .name(request.name())
                .email(request.email())
                .build();

        log.info("School {} save succefully" , school);
        repository.save(school);
        return new SchoolResponse(school);
    }

    public List<SchoolResponse> findAllSchools() {
        log.info("List of schools");

        return repository.findAll().stream()
                .filter(Objects::nonNull)
                .map(SchoolResponse::new)
                .toList();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        Optional<School> optionalSchool = repository.findById(schoolId);

        if (optionalSchool.isEmpty()) {
            throw new RuntimeException();
        }

        List<Student> students = client.findAllStudentsBySchool(schoolId);

        return new FullSchoolResponse(
                optionalSchool.get().getName(),
                optionalSchool.get().getEmail(),
                students
        );
    }
}
