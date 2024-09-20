package edu.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? "+smartTv.ligada);
        System.out.println("Canal Atual = "+smartTv.canal);
        System.out.println("Volume Atual = "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
//        System.out.println("Volume Atual -> Aumentado -> "+smartTv.volume);

        smartTv.diminuirVolume();
//        System.out.println("Volume Atual -> Diminuido -> "+smartTv.volume);

        smartTv.aumentarCanal();

        smartTv.novoCanal(15);
    }
}
