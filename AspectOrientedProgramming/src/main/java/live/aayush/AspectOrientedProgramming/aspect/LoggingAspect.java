package live.aayush.AspectOrientedProgramming.aspect;

import live.aayush.AspectOrientedProgramming.dto.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{
    @Before("execution(String live.aayush.AspectOrientedProgramming.service.StudentService.createStudent())")
    public void logBefore()
    {
        System.out.println("LoggingAspect.logBefore()");
    }

    @AfterReturning(value = "execution(* live.aayush.AspectOrientedProgramming.service.StudentService.createStudent(..))", returning = "student")
    public void logAfterReturning(Student student)
    {
        System.out.println("LoggingAspect.logAfterReturning()");
        student.setName("Aayush");
        student.setAge(23);
    }
}