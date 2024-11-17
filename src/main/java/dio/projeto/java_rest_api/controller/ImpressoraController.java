package dio.projeto.java_rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dio.projeto.java_rest_api.domain.model.Impressora;
import dio.projeto.java_rest_api.service.ImpressoraService;
import java.util.List;

@RestController
@RequestMapping("/api/impressoras")
public class ImpressoraController {

    private final ImpressoraService impressoraService;

    public ImpressoraController(ImpressoraService impressoraService) {
        this.impressoraService = impressoraService;
    }

    @GetMapping
    public ResponseEntity<List<Impressora>> findAll() {
        return ResponseEntity.ok(impressoraService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Impressora> findById(@PathVariable Long id) {
        return ResponseEntity.ok(impressoraService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Impressora> create(@RequestBody Impressora impressora) {
         return new ResponseEntity<>(impressoraService.create(impressora), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Impressora> update(@PathVariable Long id, @RequestBody Impressora impressora) {
        return ResponseEntity.ok(impressoraService.update(id, impressora));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        impressoraService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
