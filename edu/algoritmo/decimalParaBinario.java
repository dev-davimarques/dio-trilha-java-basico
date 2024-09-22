package edu.algoritmo;

public class decimalParaBinario {
    public static void main(String[] args) {
        decimalParaBinario(237);
    }
    private static void decimalParaBinario(int n){
        if(n>0){
            decimalParaBinario(n/2);
            System.out.print(n % 2);
        }
    }
}
