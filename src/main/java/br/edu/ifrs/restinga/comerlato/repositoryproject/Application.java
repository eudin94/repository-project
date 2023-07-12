package br.edu.ifrs.restinga.comerlato.repositoryproject;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.bidirectional.PassportBi;
import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.bidirectional.PersonBi;
import br.edu.ifrs.restinga.comerlato.repositoryproject.repository.onetoone.bidirectional.PersonRepositoryBi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static java.time.LocalDate.now;

@Slf4j
@SpringBootApplication
public class Application {

    @Autowired
    private PersonRepositoryBi personRepositoryBi;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner initialData() {

        return (args -> {

            final var passport = PassportBi.builder()
                    .number("12345")
                    .issueDate(now())
                    .expirationDate(now())
                    .build();

            final var person = PersonBi.builder()
                    .name("Eduardo 1")
                    .birthdate(now())
                    .cpf("12345678901")
                    .passport(passport)
                    .build();

            personRepositoryBi.save(person);
        });
    }
}
