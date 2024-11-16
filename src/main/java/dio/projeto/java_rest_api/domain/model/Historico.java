package dio.projeto.java_rest_api.domain.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroOrdemServico;
    private LocalDate dataAtendimento;
    private Integer contadorImpressora;
    private String tecnico;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "impressora_id")
    private Impressora impressora;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroOrdemServico() {
        return numeroOrdemServico;
    }

    public void setNumeroOrdemServico(String numeroOrdemServico) {
        this.numeroOrdemServico = numeroOrdemServico;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Integer getContadorImpressora() {
        return contadorImpressora;
    }

    public void setContadorImpressora(Integer contadorImpressora) {
        this.contadorImpressora = contadorImpressora;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Impressora getImpressora() {
        return impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }
}
