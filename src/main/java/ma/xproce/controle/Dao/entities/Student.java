package ma.xproce.controle.Dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Student {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_student;
    private String name;
    private String email;
    private Date datenaissance;


}
