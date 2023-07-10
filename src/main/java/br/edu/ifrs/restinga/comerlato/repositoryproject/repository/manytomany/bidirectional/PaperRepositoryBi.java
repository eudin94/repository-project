package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.manytomany.bidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.bidirectional.PaperBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepositoryBi extends JpaRepository<PaperBi, Long> {
}
