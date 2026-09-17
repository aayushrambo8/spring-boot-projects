package live.aayush.FilterDemo.controller;

import live.aayush.FilterDemo.dto.StudentDTO;
import live.aayush.FilterDemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
public class StudentController
{
    StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody StudentDTO studentDTO)
    {
        studentService.createStudent(studentDTO);
        return ResponseEntity.ok("Done");
    }
}
