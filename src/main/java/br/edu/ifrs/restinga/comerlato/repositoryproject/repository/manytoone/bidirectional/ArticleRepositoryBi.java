package br.edu.ifrs.restinga.comerlato.repositoryproject.repository.manytoone.bidirectional;

import br.edu.ifrs.restinga.comerlato.repositoryproject.model.entity.manytoone.bidirectional.ArticleBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepositoryBi extends JpaRepository<ArticleBi, Long> {
}
