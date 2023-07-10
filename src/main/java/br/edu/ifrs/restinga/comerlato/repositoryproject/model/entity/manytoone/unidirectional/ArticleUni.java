package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.unidirectional;

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
@Table(name = "article_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationDate;
    private String text;
    @ManyToOne(targetEntity = ReporterUni.class, fetch = EAGER, optional = false, cascade = ALL)
    @JoinColumn(name = "reporter_id")
    private ReporterUni reporter;
}
