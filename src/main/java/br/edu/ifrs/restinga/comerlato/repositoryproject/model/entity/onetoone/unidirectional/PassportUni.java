package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "passport_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassportUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String number;
    private LocalDate issueDate;
    private LocalDate expirationDate;
}
