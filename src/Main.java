import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao do curso de java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao do mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Trilha Java");
        bootcamp.setDescricao("jornada java top show bala!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Dev Lucas");
        devLucas.increverBootcamp(bootcamp);
        System.out.println("Conteudos inseridos: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("conteudos concluidos: " + devLucas.getConteudosConcluidos());
        System.out.println("XP do lucas:" + devLucas.calcularTotalXP());


    }


}