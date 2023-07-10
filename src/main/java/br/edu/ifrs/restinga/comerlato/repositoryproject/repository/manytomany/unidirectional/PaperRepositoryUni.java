package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.manytomany.unidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.unidirectional.PaperUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepositoryUni extends JpaRepository<PaperUni, Long> {
}
