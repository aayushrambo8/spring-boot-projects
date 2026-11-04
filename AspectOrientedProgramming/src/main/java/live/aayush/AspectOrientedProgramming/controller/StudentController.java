package live.aayush.AspectOrientedProgramming.controller;

import live.aayush.AspectOrientedProgramming.dto.Student;
import live.aayush.AspectOrientedProgramming.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController
{
    StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
        Student student1 = studentService.createStudent(student);
        return ResponseEntity.ok(student1);
    }
}
