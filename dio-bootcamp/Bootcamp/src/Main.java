import desafio.Bootcamp;
import desafio.Conteudos;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescription("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Ciência de Dados");
        curso2.setDescription("Descrição Curso Dados");
        curso2.setCargaHoraria(12);

        Mentoria ment1 = new Mentoria();
        ment1.setTitulo("Javascript");
        ment1.setDescription("Mentoria JS");
        ment1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Java Dev Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(ment1);

        Dev devBia = new Dev();
        devBia.setNome("Bia");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println(".(Conteúdos inscritos Bia: )" + devBia.getConteudosInscritos());
        devBia.progredir();
        devBia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bia: " + devBia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bia: " + devBia.getConteudosConcluidos());
        System.out.println(".(XP: )" + devBia.calcularTotalXP());

        System.out.println("---------");

    }

   

    
}
