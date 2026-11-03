package live.aayush.AspectOrientedProgramming.decorator;

import live.aayush.AspectOrientedProgramming.dto.Student;
import live.aayush.AspectOrientedProgramming.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExecutionTimeService implements StudentService
{
    private LoggingDecorator loggingDecorator;

    public ExecutionTimeService(LoggingDecorator loggingDecorator)
    {
        this.loggingDecorator = loggingDecorator;
    }

    @Override
    public void createStudent(Student student)
    {
        long startTime = System.currentTimeMillis();
        loggingDecorator.createStudent(student);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " ms");
    }
}
