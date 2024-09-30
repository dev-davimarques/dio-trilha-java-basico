package edu.contabancaria;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Digite o numero da Agencia: ");
        String agenciaDaConta = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeDoCliente = sc.next();

        System.out.println("Digite o saldo da sua conta: ");
        double saldoDaConta = sc.nextDouble();

        System.out.println("Olá "+nomeDoCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agenciaDaConta+" conta "+numeroDaConta+" e seu saldo "+saldoDaConta+" já está disponível para saque.");
    }
}
