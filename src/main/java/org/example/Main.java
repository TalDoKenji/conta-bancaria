package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        ContaBanco contaBanco = new ContaBanco();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número da sua conta Bancária: ");
        contaBanco.setNumConta(leitor.nextLine());

        System.out.println("Digite o nome do cliente: ");
        user.setNome(leitor.nextLine());

        System.out.println("Digite o número da sua agência: ");
        user.setAgencia(leitor.nextInt());

        System.out.println("Digite o saldo da conta: ");
        contaBanco.setSaldo(leitor.nextDouble());

        System.out.println("Número da conta: " + contaBanco.getNumConta());
        System.out.println("Número da agência: "+ user.getAgencia());
        System.out.println("Nome do cliente: "+ user.getNome());
        System.out.println("Saldo da conta: "+ contaBanco.getSaldo());

    }
}