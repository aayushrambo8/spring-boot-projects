package live.aayush.FilterDemo.service;

import live.aayush.FilterDemo.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    public void createStudent(StudentDTO studentDTO)
    {
        System.out.println("Student Created");
        System.out.println(studentDTO.getName());
        System.out.println(studentDTO.getEmail());
    }
}
