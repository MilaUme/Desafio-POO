import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria descrição java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMila = new Dev();
        devMila.setNome("Mila");
        devMila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mila" + devMila.getConteudosInscritos());
        devMila.progredir();
        devMila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mila" + devMila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mila" + devMila.getConteudosConcluidos());
        System.out.println("XP:" + devMila.calcularTotalXp());

        System.out.println("----");


        Dev devEric = new Dev();
        devEric.setNome("Eric");
        devEric.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eric" + devEric.getConteudosInscritos());
        devEric.progredir();
        devEric.progredir();
        devEric.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eric" + devEric.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eric" + devEric.getConteudosConcluidos());
        System.out.println("XP:" + devEric.calcularTotalXp());


    }
}