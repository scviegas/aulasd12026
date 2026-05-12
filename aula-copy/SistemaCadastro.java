
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Curso: ");
                String curso = scanner.nextLine();

                Aluno aluno = new Aluno(nome, idade, curso);
                alunos.add(aluno);

                System.out.println("Aluno cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("=== LISTA DE ALUNOS ===");

                for (Aluno aluno : alunos) {
                    aluno.exibirDados();
                }
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}