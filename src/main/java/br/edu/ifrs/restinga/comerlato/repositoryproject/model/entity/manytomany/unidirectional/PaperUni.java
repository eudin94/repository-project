package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.unidirectional;

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
@Table(name = "paper_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaperUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationDate;
    private String text;
}
