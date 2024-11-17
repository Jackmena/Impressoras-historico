package dio.projeto.java_rest_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.projeto.java_rest_api.domain.model.Impressora;

public interface ImpressoraRepository extends JpaRepository<Impressora, Long> {

    boolean existsBySerie(String serie);

    @Query("SELECT i FROM Impressora i LEFT JOIN FETCH i.historico WHERE i.id = :id")
    Impressora findByIdWithHistorico(@Param("id") Long id);
}