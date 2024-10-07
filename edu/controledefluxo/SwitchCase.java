package edu.controledefluxo;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "G";
//        if(sigla == "P" || sigla == "p"){
//            System.out.println("PEQUENO");
//        } else if (sigla == "M" || sigla == "m") {
//            System.out.println("MÉDIO");
//        } else if (sigla == "G" || sigla == "g") {
//            System.out.println("GRANDE");
//        } else {
//            System.out.println("INDEFINIDO");
//        }

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }

        int mes = 12;

        switch (mes){
            case 1:{
                System.out.println("January");
                break;
            }
            case 2:{
                System.out.println("February");
                break;
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
                break;
            }
            case 5:{
                System.out.println("May");
                break;
            }
            case 6:{
                System.out.println("June");
                break;
            }
            case 7:{
                System.out.println("July");
                break;
            }
            case 8:{
                System.out.println("August");
                break;
            }
            case 9:{
                System.out.println("September");
                break;
            }
            case 10:{
                System.out.println("October");
                break;
            }
            case 11:{
                System.out.println("November");
                break;
            }
            case 12:{
                System.out.println("December");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }

        }

    }
}
