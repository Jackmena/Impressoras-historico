package dio.projeto.java_rest_api.service.impl;

import org.springframework.stereotype.Service;

import dio.projeto.java_rest_api.domain.model.Historico;
import dio.projeto.java_rest_api.domain.model.Impressora;
import dio.projeto.java_rest_api.domain.repository.HistoricoRepository;
import dio.projeto.java_rest_api.service.HistoricoService;
import dio.projeto.java_rest_api.service.ImpressoraService;
import java.util.List;

@Service
public class HistoricoServiceImpl implements HistoricoService {

    private final HistoricoRepository historicoRepository;
    private final ImpressoraService impressoraService;

    public HistoricoServiceImpl(HistoricoRepository historicoRepository, ImpressoraService impressoraService) {
        this.historicoRepository = historicoRepository;
        this.impressoraService = impressoraService;
    }

    @Override
    public Historico create(Long impressoraId, Historico historico) {
        Impressora impressora = impressoraService.findById(impressoraId);
        historico.setImpressora(impressora);
        return historicoRepository.save(historico);
    }

    @Override
    public List<Historico> findByImpressoraId(Long impressoraId) {
        return historicoRepository.findByImpressoraId(impressoraId);
    }
}
