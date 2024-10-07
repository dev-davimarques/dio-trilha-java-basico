package edu.controledefluxo;

public class CondicionalComposta {
    public static void main(String[] args) {
        int nota1;
        nota1 = 8;
        if (nota1 >= 7){
            System.out.println("Aluno(a) Aprovado(a) - Nota: "+nota1);
        } else {
            System.out.println("Aluno(a) Reprovado(a) - Nota: "+nota1);
        }
    }
}
