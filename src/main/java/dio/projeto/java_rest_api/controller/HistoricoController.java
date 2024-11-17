package dio.projeto.java_rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dio.projeto.java_rest_api.domain.model.Historico;
import dio.projeto.java_rest_api.service.HistoricoService;
import java.util.List;

@RestController
@RequestMapping("/api/historicos")
public class HistoricoController {

    private final HistoricoService historicoService;

    public HistoricoController(HistoricoService historicoService) {
        this.historicoService = historicoService;
    }

    @PostMapping("/{impressoraId}")
    public ResponseEntity<Historico> create(@PathVariable Long impressoraId, @RequestBody Historico historico) {
        return new ResponseEntity<>(historicoService.create(impressoraId, historico), HttpStatus.CREATED);
    }

    @GetMapping("/impressora/{impressoraId}")
    public ResponseEntity<List<Historico>> findByImpressoraId(@PathVariable Long impressoraId) {
        return ResponseEntity.ok(historicoService.findByImpressoraId(impressoraId));
    }
}