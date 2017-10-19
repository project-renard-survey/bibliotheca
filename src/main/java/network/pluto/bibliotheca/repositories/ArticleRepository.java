package network.pluto.bibliotheca.repositories;

import network.pluto.bibliotheca.models.Article;
import network.pluto.bibliotheca.models.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Page<Article> findByCreatedBy(Member createdBy, Pageable pageable);
}
