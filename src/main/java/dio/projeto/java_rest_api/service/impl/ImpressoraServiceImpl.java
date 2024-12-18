package dio.projeto.java_rest_api.service.impl;

import org.springframework.stereotype.Service;
import dio.projeto.java_rest_api.domain.model.Impressora;
import dio.projeto.java_rest_api.domain.repository.ImpressoraRepository;
import dio.projeto.java_rest_api.service.ImpressoraService;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ImpressoraServiceImpl implements ImpressoraService {

    private final ImpressoraRepository impressoraRepository;

    public ImpressoraServiceImpl(ImpressoraRepository impressoraRepository) {
        this.impressoraRepository = impressoraRepository;
    }

    @Override
    public Impressora findById(Long id) {
        Impressora impressora = impressoraRepository.findByIdWithHistorico(id);
        if (impressora == null) {
            throw new NoSuchElementException("Impressora não encontrada");
        }
        return impressora;
    }

    @Override
    public Impressora create(Impressora impressora) {
        if(impressoraRepository.existsBySerie(impressora.getSerie())) {
            throw new IllegalArgumentException("Uma impressora com está série já existe.");
        }
        return impressoraRepository.save(impressora);
    }

    @Override
    public List<Impressora> findAll() {
        return impressoraRepository.findAll();
    }

    @Override
    public Impressora update(Long id, Impressora impressora) {
        Impressora existing = findById(id);
        existing.setMarca(impressora.getMarca());
        existing.setModelo(impressora.getModelo());
        existing.setSerie(impressora.getSerie());
        return impressoraRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        impressoraRepository.deleteById(id);
    }
}
