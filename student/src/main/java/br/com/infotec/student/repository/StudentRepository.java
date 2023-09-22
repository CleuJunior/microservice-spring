package br.com.infotec.student.repository;

import br.com.infotec.student.api.dto.StudentResponse;
import br.com.infotec.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<StudentResponse> findAllBySchoolId(Integer schoolId);
}
