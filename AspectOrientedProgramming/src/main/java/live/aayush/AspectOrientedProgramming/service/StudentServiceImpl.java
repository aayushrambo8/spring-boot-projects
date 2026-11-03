package live.aayush.AspectOrientedProgramming.service;

import live.aayush.AspectOrientedProgramming.dto.Student;
import live.aayush.AspectOrientedProgramming.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student)
    {
        studentRepository.save(student);
    }
}
