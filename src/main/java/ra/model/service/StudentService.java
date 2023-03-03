package ra.model.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.model.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int studentId);
    Student saveOrUpdate(Student student);
    void delete(int studentId);
    List<Student> searchByName(String studentName);
    List<Student> sortStudentByStudentName(String direction);
    Page<Student> getPagging(Pageable pageable);

}
