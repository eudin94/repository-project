package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Table(name = "paper_bidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaperBi {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationDate;
    private String text;
    @ManyToMany(mappedBy = "papers", cascade = ALL, fetch = LAZY, targetEntity = MagazineBi.class)
    private List<MagazineBi> magazines = new ArrayList<>();
}
