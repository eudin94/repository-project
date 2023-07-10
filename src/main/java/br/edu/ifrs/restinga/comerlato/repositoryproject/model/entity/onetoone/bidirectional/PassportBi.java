package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "passport_bidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassportBi {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String number;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    @OneToOne(mappedBy = "passport", targetEntity = PersonBi.class, optional = false, cascade = ALL, fetch = EAGER)
    private PersonBi person;
}
