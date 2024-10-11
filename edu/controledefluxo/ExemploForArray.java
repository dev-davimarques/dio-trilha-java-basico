package edu.controledefluxo;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"DAVI", "ANDREY", "CIRO", "NAGILA"};
//        for (int x = 0; x < alunos.length; x++){
//            System.out.println("O aluno no indice x="+x+" é "+alunos[x]);
//        }


//        Forma reduzida de usar o for
        for (String aluno : alunos){
            System.out.println("Nome do Aluno é: "+aluno);
        }
    }
}
