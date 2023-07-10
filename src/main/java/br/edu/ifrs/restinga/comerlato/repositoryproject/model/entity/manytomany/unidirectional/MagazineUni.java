package br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.unidirectional;

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
@Table(name = "magazine_unidirectional")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MagazineUni {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private Integer edition;
    @ManyToMany(cascade = ALL, fetch = LAZY, targetEntity = PaperUni.class)
    @JoinTable(
            name = "association_magazine_paper_uni",
            joinColumns = @JoinColumn(name = "fk_magazine"),
            inverseJoinColumns = @JoinColumn(name = "fk_paper")
    )
    private List<PaperUni> papers = new ArrayList<>();
}
