package ma.xproce.controle.service;

import ma.xproce.controle.Dao.entities.Student;
import ma.xproce.controle.Dto.StudentDto;

import java.util.Date;
import java.util.List;

public interface StudentService {

 StudentDto GetStudentByDatenaissance(Date datenaiss);

 StudentDto SaveStudent( StudentDto studentDto);

}
