package ma.xproce.controle.Dao.repositories;

import ma.xproce.controle.Dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {


    Student findByDatenaissance (Date datenaiss);



}
