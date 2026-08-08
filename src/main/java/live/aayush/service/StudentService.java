package live.aayush.service;

import live.aayush.entity.Student;
import live.aayush.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentRequest)
    {
        Student studentResponse = studentRepository.save(studentRequest);
        return studentResponse;
    }
}
