package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.manytoone.unidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.unidirectional.ReporterUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporterRepositoryUni extends JpaRepository<ReporterUni, Long> {
}
