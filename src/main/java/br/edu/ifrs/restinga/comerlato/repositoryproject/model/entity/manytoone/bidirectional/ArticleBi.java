package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.bidirectional;

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
@Table(name = "article_bidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleBi {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationDate;
    private String text;
    @ManyToOne(targetEntity = ReporterBi.class, fetch = EAGER, optional = false, cascade = ALL)
    @JoinColumn(name = "reporter_id")
    private ReporterBi reporter;
}
