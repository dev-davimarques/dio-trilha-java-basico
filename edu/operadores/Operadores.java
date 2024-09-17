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
        int numero = -5;
        System.out.println(numero);

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

    }
}
