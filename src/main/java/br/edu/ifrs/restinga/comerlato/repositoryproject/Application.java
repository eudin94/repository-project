package br.edu.ifrs.restinga.comerlato.repositoryproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

//    @Autowired
//    private PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner initialData() {
//
//        return (args -> {
//
//            final var person1 = Person.builder()
//                    .cpf("12345678901")
//                    .name("Eduardo 1")
//                    .email("eduardo1@mail.com")
//                    .build();
//
//            log.info("CREATED PERSON 1");
//
//            final var saved1 = repository.save(person1);
//            log.info("SAVED = " + saved1);
//
//            final var person2 = Person.builder()
//                    .cpf("12345678902")
//                    .name("Eduardo 2")
//                    .email("eduardo2@mail.com")
//                    .build();
//
//            final var saved2 = repository.save(person2);
//            log.info("SAVED = " + saved2);
//
//            final var person3 = Person.builder()
//                    .cpf("12345678903")
//                    .name("Eduardo 3")
//                    .email("eduardo3@mail.com")
//                    .build();
//
//            final var saved3 = repository.save(person3);
//            log.info("SAVED = " + saved3);
//
//            repository.delete(saved1);
//            log.warn("DELETED = " + saved1);
//
//            repository.delete(saved2);
//            log.warn("DELETED = " + saved2);
//
//            repository.delete(saved3);
//            log.warn("DELETED = " + saved3);
//        });
//    }
}
