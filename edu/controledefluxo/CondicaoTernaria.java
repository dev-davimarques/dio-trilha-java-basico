package edu.controledefluxo;

public class CondicaoTernaria {
    public static void main(String[] args) {
        int media = 7;
        String resultado = media>=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        int media2 = 4;
        String resultado2 = media2>=7 ? "Aprovado" : media2>=5 && media2<7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
