package edu.controledefluxo;

public class CondicionalEncadeada {
    public static void main(String[] args) {
            int media = 4;
            if (media > 7){
                System.out.println("Média acima de 7");
            } else if (media>=5 && media<=7) {
                System.out.println("Média maior ou igual a 5 e menor ou igual 7");
            } else {
                System.out.println("Média menor que 5.");
            }
    }
}
