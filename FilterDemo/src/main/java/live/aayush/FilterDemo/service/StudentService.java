package live.aayush.FilterDemo.service;

import live.aayush.FilterDemo.dto.StudentDTO;
import live.aayush.FilterDemo.dto.StudentResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    public StudentResponseDTO createStudent(StudentDTO studentDTO)
    {
        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();
        studentResponseDTO.setName(studentDTO.getName());
        studentResponseDTO.setMessage("Student Created");
        studentResponseDTO.setEmail(studentDTO.getEmail());
        return studentResponseDTO;
    }
}
