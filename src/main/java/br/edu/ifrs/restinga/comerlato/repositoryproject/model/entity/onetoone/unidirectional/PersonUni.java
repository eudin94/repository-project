package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.unidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "person_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthdate;
    private String cpf;
    @ElementCollection
    private ArrayList<String> visas;
    @OneToOne(cascade = ALL, targetEntity = PassportUni.class, fetch = EAGER, orphanRemoval = true)
    private PassportUni passport;
}
