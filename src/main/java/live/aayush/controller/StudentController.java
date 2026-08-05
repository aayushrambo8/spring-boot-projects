package live.aayush.controller;

import live.aayush.entity.Student;
import live.aayush.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController
{
    private StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student)
    {
        Student createdStudent = studentService.createStudent(student);
        return createdStudent;
    }

    @GetMapping
    public void readStudent()
    {

    }
}
