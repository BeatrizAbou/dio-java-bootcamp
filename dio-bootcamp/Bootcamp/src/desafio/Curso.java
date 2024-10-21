package desafio;
public class Curso extends Conteudos{
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(){
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{" + 
                "titulo = ' " + getTitulo() + '\'' + 
                ", descricao = ' " + getDescription() + '\'' + 
                ", cargaHoraria=" + cargaHoraria + 
                '}';
    }
}
