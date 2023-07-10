package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.manytomany.unidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytomany.unidirectional.MagazineUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazineRepositoryUni extends JpaRepository<MagazineUni, Long> {
}
