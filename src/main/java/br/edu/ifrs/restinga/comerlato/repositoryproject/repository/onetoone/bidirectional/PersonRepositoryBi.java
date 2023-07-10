package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.onetoone.bidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.onetoone.bidirectional.PersonBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryBi extends JpaRepository<PersonBi, Long> {
}
