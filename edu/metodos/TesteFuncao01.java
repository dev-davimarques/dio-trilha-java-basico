package edu.metodos;

public class TesteFuncao01 {
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é "+s);
    }

    static int somaComRetorno(int a, int b){
        int s = a + b;
        return s;
    }

//    método funcional apenas dentro da classe
    public static void main(String[] args) {
        soma(15,17);
        int sm = somaComRetorno(13,15);
        System.out.println("A soma vale "+sm);
    }
}
