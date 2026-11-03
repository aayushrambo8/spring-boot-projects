package live.aayush.AspectOrientedProgramming.decorator;

import live.aayush.AspectOrientedProgramming.dto.Student;
import live.aayush.AspectOrientedProgramming.service.StudentService;
import live.aayush.AspectOrientedProgramming.service.StudentServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class LoggingDecorator implements StudentService
{
    private final StudentServiceImpl studentServiceImpl;

    public LoggingDecorator(StudentServiceImpl studentServiceImpl)
    {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Override
    public void createStudent(Student student)
    {
        LoggingServiceUtil.logStart("StudentServiceImpl", "createStudent");
        studentServiceImpl.createStudent(student);
        LoggingServiceUtil.logEnd("StudentServiceImpl", "createStudent");
    }
}
