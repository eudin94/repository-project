package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;


@Data
@Table(name = "magazine_bidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MagazineBi {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private Integer edition;
    @ManyToMany(cascade = ALL, fetch = LAZY, targetEntity = PaperBi.class)
    @JoinTable(
            name = "association_magazine_paper_bi",
            joinColumns = @JoinColumn(name = "fk_magazine"),
            inverseJoinColumns = @JoinColumn(name = "fk_paper")
    )
    private List<PaperBi> papers = new ArrayList<>();
}
