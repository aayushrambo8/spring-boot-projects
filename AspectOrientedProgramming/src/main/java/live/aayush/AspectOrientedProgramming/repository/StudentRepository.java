package live.aayush.AspectOrientedProgramming.repository;

import live.aayush.AspectOrientedProgramming.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository
{
    public void save(Student student)
    {
        System.out.println("Student saved");
    }
}
