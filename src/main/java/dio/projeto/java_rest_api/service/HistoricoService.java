package dio.projeto.java_rest_api.service;

import dio.projeto.java_rest_api.domain.model.Historico;
import java.util.List;

public interface HistoricoService {

    Historico create(Long impressoraId, Historico historico);

    List<Historico> findByImpressoraId(Long impressoraId);
}