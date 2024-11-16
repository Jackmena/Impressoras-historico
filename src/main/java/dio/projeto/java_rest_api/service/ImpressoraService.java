package dio.projeto.java_rest_api.service;

import dio.projeto.java_rest_api.domain.model.Impressora;
import java.util.List;

public interface ImpressoraService {

    Impressora findById(Long id);

    Impressora create(Impressora impressora);

    List<Impressora> findAll();

    Impressora update(Long id, Impressora impressora);

    void delete(Long id);
}