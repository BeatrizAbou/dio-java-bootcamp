package desafio;
public abstract class Conteudos {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String description;

    public abstract double calcularXP();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
