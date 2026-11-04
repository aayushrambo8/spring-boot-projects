package live.aayush.AspectOrientedProgramming.service;

import live.aayush.AspectOrientedProgramming.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    public Student createStudent(Student student)
    {
       System.out.println("LoggingAspect.createStudent()");
       return student;
    }
}
