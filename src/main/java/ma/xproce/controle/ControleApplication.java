package ma.xproce.controle;


import ma.xproce.controle.Dao.entities.Student;
import ma.xproce.controle.Dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.List;

@SpringBootApplication

public class ControleApplication {

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start() {
        return args -> {

            List<Student> Students = List.of(
                    Student.builder().name("S 1").build(),
                    Student.builder().name("S2").build(),
                    Student.builder().name("S 3").build(),
                    Student.builder().name("S 4").build()
            );
            studentRepository.saveAll(Students);

        };




    }

}
