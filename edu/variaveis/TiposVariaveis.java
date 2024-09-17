package edu.variaveis;

import java.sql.SQLOutput;

public class TiposVariaveis {
    public static void main(String[] args) {
//        Tipos primitivos / Palavras reservadas;
//        int, byte, short, long, float, double, boolean, char;
//        Esses tipos são considerados objetos, e representam valores brutos;
//        Eles são armazenados diretamente na pilha de memória (Memory Stack);
//        Tipos mais utilizados: int, double e String.

        int minhaIdade = 24;
        String meuNome = "Davi Marques";
        double minhaAltura = 1.85;
        System.out.println("Meu nome é "+meuNome+" tenho "+minhaIdade+" anos e "+minhaAltura+" de altura");

//        2500 é diferente de 2.500

//        Variáveis vs constantes
//        Em java as constates são representadas pela a palavra reservada final, seguida do tipo
//        Por convenção, CONSTANTES são escritas em CAIXA ALTA.
        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

//        Atribuir a final fixará aquele valor
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
