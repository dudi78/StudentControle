package ma.xproce.controle.service;

import ma.xproce.controle.Dao.repositories.StudentRepository;
import ma.xproce.controle.Dto.StudentDto;
import ma.xproce.controle.Mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class StudentManager  implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentMapper mapper;

    @Override
    public StudentDto GetStudentByDatenaissance(Date datenaiss) {

      return  mapper.FromStudentToStudentDto( studentRepository.findByDatenaissance(datenaiss));



    }

    @Override
    public StudentDto SaveStudent(StudentDto studentDto) {


      return mapper.FromStudentToStudentDto( studentRepository.save(mapper.FromStudentDtoToStudent(studentDto)));
    }


}
