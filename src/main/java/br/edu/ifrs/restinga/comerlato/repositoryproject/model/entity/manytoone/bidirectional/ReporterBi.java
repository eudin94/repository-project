package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "reporter_bidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReporterBi {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    @OneToMany(targetEntity = ArticleBi.class, fetch = EAGER, mappedBy = "reporter", cascade = ALL)
    private List<ArticleBi> articles = new ArrayList<>();
}
