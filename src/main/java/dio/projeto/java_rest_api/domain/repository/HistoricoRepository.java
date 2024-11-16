package dio.projeto.java_rest_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.projeto.java_rest_api.domain.model.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long> {
}
