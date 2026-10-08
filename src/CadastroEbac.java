import java.util.Scanner;

public class CadastroEbac {

    public static void main(String[] args) {

        System.out.println("Seja bem-vindo(a)!");

        Scanner sc = new Scanner(System.in);

        String nome, cpf, estadoCivil;
        int idade;
        double peso, altura;

        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();

        System.out.println("Digite seu cpf: ");
        cpf = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite seu estado civil: ");
        estadoCivil = sc.nextLine();

        System.out.println("\n--- Dados cadastrados ---");
        System.out.println("Nome completo: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Estado civil: " + estadoCivil);

        sc.close();

    }

}

