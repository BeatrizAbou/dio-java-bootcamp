package desafio;
import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosConcluidos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public void calcularTotalXP() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()) {
            double next = iterator.next().calcularXP;
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos(){
        return conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
    }
    @Override
    public int hashCode() {
        return Object.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
