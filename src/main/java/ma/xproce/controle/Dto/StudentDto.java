package ma.xproce.controle.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String name;
    private String email;
    private Date date_naissance;
}
