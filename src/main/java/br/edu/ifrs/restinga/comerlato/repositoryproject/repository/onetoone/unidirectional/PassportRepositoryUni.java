package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.onetoone.unidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.unidirectional.PassportUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepositoryUni extends JpaRepository<PassportUni, Long> {
}
