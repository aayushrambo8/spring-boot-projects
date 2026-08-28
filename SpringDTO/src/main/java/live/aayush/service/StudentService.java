package live.aayush.service;

import live.aayush.entity.Student;
import live.aayush.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentRequest)
    {
        studentRequest.setDeleted(false);
        return studentRepository.save(studentRequest);
    }

    public Student getStudent(Long id)
    {
        Optional<Student> studentResponse = studentRepository.findByIdAndDeletedIsFalse(id);
        return studentResponse.orElse(null);
    }

    public List<Student> getAllStudent()
    {
        return studentRepository.findByDeletedIsFalse();
    }

    public Student updateStudent(Long id, Student studentRequest)
    {
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if(existingStudent.isEmpty()) return null;

        Student studentUpdate = existingStudent.get();

        studentUpdate.setName(studentRequest.getName());
        studentUpdate.setAge(studentRequest.getAge());
        studentUpdate.setEmail(studentRequest.getEmail());
        studentUpdate.setSubject(studentRequest.getSubject());
        studentUpdate.setRollNo(studentRequest.getRollNo());
        studentUpdate.setDeleted(false);

        return studentRepository.save(studentUpdate);
    }

    public boolean deleteStudent(Long id)
    {
        boolean isStudent = studentRepository.existsById(id);
        if(!isStudent) return false;
        studentRepository.deleteById(id);
        return true;
    }

    public void deleteAllStudent()
    {
        studentRepository.deleteAll();
    }

    public boolean softDeleteStudent(Long id)
    {
        Optional<Student> existingStudent = studentRepository.findByIdAndDeletedIsFalse(id);
        if(existingStudent.isEmpty()) return false;
        existingStudent.get().setDeleted(true);
        studentRepository.save(existingStudent.get());
        return true;
    }
}
