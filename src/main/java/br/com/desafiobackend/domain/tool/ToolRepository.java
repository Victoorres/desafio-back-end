package br.com.desafiobackend.domain.tool;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToolRepository extends JpaRepository<Tool, Long> {

    @Query(value = "SELECT * FROM tool t\n" +
            "WHERE t.tags LIKE '%' :tag '%'", nativeQuery = true)
    List<Tool> findToolByTag(@Param("tag") String tag);

    @Query(value = "SELECT * FROM tool t\n" +
            "WHERE CONCAT(t.title, t.description, t.tags) LIKE '%' :data '%'", nativeQuery = true)
    List<Tool> findToolByTitleLinkDescriptionTag(@Param("data") String data);
}
