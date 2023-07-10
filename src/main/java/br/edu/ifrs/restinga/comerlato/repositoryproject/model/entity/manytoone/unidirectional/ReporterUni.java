package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "reporter_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReporterUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String cpf;
}
