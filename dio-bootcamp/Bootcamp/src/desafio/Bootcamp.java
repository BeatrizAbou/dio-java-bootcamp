package desafio;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String description;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudos> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    
    public void setDevsInscritos() {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudos> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(description, bootcamp.description) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, description, dataInicial, dataFinal, devsInscritos,conteudos);
    }

}
