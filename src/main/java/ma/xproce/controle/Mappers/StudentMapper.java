package ma.xproce.controle.Mappers;

import ma.xproce.controle.Dao.entities.Student;
import ma.xproce.controle.Dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class StudentMapper {

    private final ModelMapper Studentmapper = new ModelMapper();

    public StudentDto FromStudentToStudentDto(Student student){

        return Studentmapper.map(student,StudentDto.class);
    }


    public  Student FromStudentDtoToStudent(  StudentDto studentDto){

        return Studentmapper.map(studentDto,Student.class);
    }
}
