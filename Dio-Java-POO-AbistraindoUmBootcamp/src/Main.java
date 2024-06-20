import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JavaBasico");
        curso1.setDescricao("Java de maneira simples e facil");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaIntermediaria");
        curso2.setDescricao("Java de maneira profundo");
        curso2.setCargaHoraria(50);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java por IA");
        mentoria1.setDescricao("Te ensino a usar IA para aprender Java basico");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Santander");
        bootcamp.setDescricao("Descricao Bootcamp Java Santander");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLoan = new Dev();
        devLoan.setNome("Loan");
        devLoan.inscreverBootcamp(bootcamp);
        devLoan.progredir();
        devLoan.progredir();
        System.out.println("conteudos incritos: " + devLoan.getConteudosIncritos());
        System.out.println("conteudos concluidos: " + devLoan.getConteudosConcluidos());
        System.out.println("XP: " + devLoan.calcularTotalXp());

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        devRenato.progredir();
        System.out.println("Conteudos inscritos: " + devRenato.getConteudosIncritos());
        System.out.println("conteudos concluidos: " + devRenato.getConteudosConcluidos());
        System.out.println("XP: " + devRenato.calcularTotalXp());
    }
}
