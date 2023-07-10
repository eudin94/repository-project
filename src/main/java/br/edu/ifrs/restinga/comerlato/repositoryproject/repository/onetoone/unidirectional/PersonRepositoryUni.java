package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.onetoone.unidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.unidirectional.PersonUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryUni extends JpaRepository<PersonUni, Long> {
}
