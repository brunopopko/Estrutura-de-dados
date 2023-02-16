import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Implemente um programa para cadastro de alunos de uma disciplina
utilizando a linguagem Java, seguindo os seguintes critérios:
Criar uma estrutura heterogênea (array) do tipo string
para cadastrar o nome de 25 alunos; 
Garantir que a estrutura seja totalmente preenchida.
Após implementar o programa e preencher o array com o nome dos alunos,
cadastre mais 5 novos alunos.
 */

public class CadastroAlunos {
    public static void main(String[] args) {
        //funcaoQueVaiDarErro();
        Cadastrar();

    }

    public static void funcaoQueVaiDarErro() {
        Scanner entrada = new Scanner(System.in);
        String[] alunos = new String[25];
        int i = 0;
        for(; i < 25; i++) {
            System.out.println("Insira o nome do aluno " + (i + 1) + ":");
            alunos[i] = entrada.nextLine();
        }

        for(int a = 0; a < alunos.length; a++) {
            System.out.println("Aluno " + (a + 1) + ": " + alunos[a]);
        }

        for(; i < 30; i++) {
            System.out.println("Insira o nome do aluno " + (i + 1) + ":");
            alunos[i] = entrada.nextLine();
        }

        for(int b = 0; b < alunos.length; b++) {
            System.out.println("Aluno " + (b + 1) + ": " + alunos[b]);
        }
        entrada.close();
    }

    public static void Cadastrar() {
        Scanner entrada = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();
        int i = 0;
        for(; i < 25; i++) {
            System.out.println("Insira o nome do aluno " + (i + 1) + ":");
            alunos.add(entrada.nextLine());
        }

        for(String nome : alunos) {
            System.out.println("Aluno: " + nome);
        }

        for(; i < 30; i++) {
            System.out.println("Insira o nome do aluno " + (i + 1) + ":");
            alunos.add(entrada.nextLine());
        }

        for(String nome : alunos) {
            System.out.println("Aluno: " + nome);
        }

        entrada.close();
    }
}
