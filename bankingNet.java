import java.util.Scanner;

public class bankingNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;
        double saldo = 0.0; // saldo inicial
        boolean usuarioCadastrado = false;

        while (executando) {
            // Menu inicial
            System.out.println("Bem-vindo ao Banking Net!");

            if (!usuarioCadastrado) {
                System.out.println("1. Cadastrar");
                System.out.println("2. Login");
            } else {
                System.out.println("3. Depositar");
                System.out.println("4. Sacar");
            }

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1 && !usuarioCadastrado) {
                // Cadastro de novo usuário
                System.out.println("Cadastro de novo usuário:");
                System.out.print("Digite seu nome: ");
                String nome = scanner.next();
                System.out.print("Digite 5 dígitos para a conta: ");
                int conta = scanner.nextInt();
                System.out.print("Digite 5 dígitos para a senha: ");
                int senha = scanner.nextInt();
                System.out.print("Digite o valor inicial da conta: ");
                saldo = scanner.nextDouble();
                usuarioCadastrado = true;

                // Simulando o cadastro (imprimindo os dados fornecidos)
                System.out.println("Usuário cadastrado com sucesso!");
                System.out.println("Nome: " + nome);
                System.out.println("Conta: " + conta);
                System.out.println("Saldo Inicial: R$" + saldo);
            } else if (opcao == 2 && !usuarioCadastrado) {
                // Login de usuário existente
                System.out.print("Digite seu nome de usuário: ");
                String nomeUsuario = scanner.next();

                // Verificando se é o Neymar (usuário cadastrado)
                if (nomeUsuario.equalsIgnoreCase("neymar")) {
                    System.out.println("Bem-vindo, Neymar!");
                    usuarioCadastrado = true;
                } else {
                    System.out.println("Usuário não encontrado.");
                }
            } else if (opcao == 3 && usuarioCadastrado) {
                // Depositar
                System.out.print("Digite o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso.");
            } else if (opcao == 4 && usuarioCadastrado) {
                // Sacar
                System.out.print("Digite o valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso.");
                }
            } else if (opcao == 0) {
                // Encerrar o programa
                System.out.println("Encerrando o Banking Net...");
                executando = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}



