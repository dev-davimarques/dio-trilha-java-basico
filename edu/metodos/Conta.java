package edu.metodos;

public class Conta {
    private Double saldo;
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void verificaSaldo(){
        System.out.println("Valor do Saldo: R$ "+getSaldo());
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(699);
        conta.depositar(526);
        conta.verificaSaldo();
    }

}
