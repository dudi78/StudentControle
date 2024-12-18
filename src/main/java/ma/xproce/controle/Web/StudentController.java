package ma.xproce.controle.Web;


import ma.xproce.controle.Dto.StudentDto;
import ma.xproce.controle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @QueryMapping
    public StudentDto getStudentByDateNaissance(@Argument Date dateNaiss){
        return studentService.GetStudentByDatenaissance(dateNaiss);
    }
    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto studentDto){
        return studentService.SaveStudent(studentDto);
    }
}
