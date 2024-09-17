package edu.operadores;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
//        Operador de atribuição serve para atribuir o valor inicial de uma variável ou mudar o valor

//        ----------------- Operador de atribuição -----------------
        String nome = "Davi";
//      String entre aspas duplas

        double peso = 91.5;
//      para representar a parte decimal de um valor utiliza-se o ponto '.'

        int idade = 24;

        char sexo = 'M';
//      utiliza-se aspas simples

        boolean doadorOrgao = false;
//      quer dizer sim(true) ou não(false)

        Date dataNascimento = new Date();
//      palavra reservada new


//       ----------------- Operações aritméticas -----------------
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

//        Podemos concatenar String utilizando o operador de soma, ex.:
        String nomeCompleto = "Davi"+" Marques";
        System.out.println(nomeCompleto);


//       ----------------- Operadores Unários -----------------
        int num01 = 5;
        int num02 = -4;
        int num03 = 4;
        int num04 = -4;
        num01++;
        num02--;
        num03--;
        num04++;
        System.out.println(num01);
        System.out.println(num02);
        System.out.println(num03);
        System.out.println(num04);

//        Negando valores
        boolean variavel = false;
        boolean variavel2 = true;
        System.out.println(!variavel);
        System.out.println(!variavel2);

//      ----------------- Operador Ternário -----------------
        double salario = 1000;
        double novoSalario = 1000;
        double bonus;

//        1º forma
        if (salario >= 1000) {
            salario = salario + (salario * 0.10);
        } else {
            salario = salario + (salario * 0.15);
        }
        System.out.println(salario);

//        2º forma utilizando o operador ternário
        bonus = novoSalario * (novoSalario >= 1000 ? 0.10 : 0.15);
        System.out.println(bonus+novoSalario);

//        ----------------- Operadores Relacionais -----------------
        int numero1 = 1;
        int numero2 = 2;
        boolean simOuNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? "+ simOuNao);
        simOuNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? "+ simOuNao);
        simOuNao = numero1 > numero2;
        System.out.println("numero1 é maior que numero2? "+ simOuNao);
        simOuNao = numero1 < numero2;
        System.out.println("numero1 é menor que numero2? "+ simOuNao);
//        ------ comparando String's ---------
        String nomeUm = "Davi";
        String nomeDois = new String("Davi");
        System.out.println(nomeUm == nomeDois);
//        o metodo equals é utilizado para comparar objetos
        System.out.println(nomeUm.equals(nomeDois));


//        ----------------- Operadores Lógicos -----------------
//        && operador lógico "E"
//        || operador lógico "OU"
        boolean condicao1 = false;
        boolean condicao2 = false;
        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        } else {
            System.out.println("As duas condições não são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições são verdadeiras");
        } else {
            System.out.println("As duas condições são falsas");
        }
    }
}
