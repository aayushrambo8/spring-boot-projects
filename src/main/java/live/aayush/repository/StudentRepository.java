package live.aayush.repository;

import live.aayush.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentRepository
{
    public Student saveStudent(Student studentReq)
    {
        System.out.println("Inside Student Repository");
        Student s1 = new Student();
        s1.setAge(22);
        s1.setEmail("aayushrambo8");
        s1.setName("Aayush");
        s1.setRollNo(226);
        s1.setSubject("CS2");
        return s1;
    }
}
