package dio.projeto.java_rest_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.projeto.java_rest_api.domain.model.Impressora;

public interface ImpressoraRepository extends JpaRepository<Impressora, Long> {

    boolean existsByImpressoraSerial(String impressoraSerial);
}