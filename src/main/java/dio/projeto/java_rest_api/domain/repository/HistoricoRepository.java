package dio.projeto.java_rest_api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.projeto.java_rest_api.domain.model.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {

    List<Historico> findByImpressoraId(Long impressoraId);
}
