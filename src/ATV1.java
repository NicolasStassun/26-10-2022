import java.util.Scanner;

public class ATV1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        boolean congelado, Hermione, DumbledorHogwarts, severo, mengo;
        double notaHermione;

        System.out.println("Dumbledor está em Hogwarts?/n Escreva True se a resposta" +
                " for verdadeira ou False caso seja falsa: ");
        DumbledorHogwarts = sc.nextBoolean();

        System.out.println("Qual a nota de Hermione: ");
        notaHermione = sc.nextDouble();

        if(notaHermione>=7){
            Hermione=true;
        }
        else{
            Hermione=false;
        }

        System.out.printf("Severo dará aula de feitiços aquáticos esse semestre?" +
                "Escreva True se a resposta for verdadeira ou False caso seja falsa: ");
        severo = sc.nextBoolean();

        System.out.printf("O time de Harry ganhou a partida de Quadribol?" +
                "Escreva True se a resposta for verdadeira ou False caso seja falsa: ");
        mengo = sc.nextBoolean();

        if(DumbledorHogwarts=true){
            System.out.println("Rony foi descongelado.");
        }

        else if(severo==true & mengo==true){
            System.out.println("Rony foi descongelado.");
        }
        else if(severo==true & Hermione==true){
            System.out.println("Rony foi descongelado.");
        }
        else if(severo==false & DumbledorHogwarts==false){
            System.out.println("Rony foi descongelado.");
        }
        else if(severo==true & Hermione==true){
            System.out.println("Rony foi descongelado.");
        }
        else if(mengo==true & Hermione==false){
            System.out.println("Rony foi descongelado.");
        }
        else if(severo==true & Hermione==false){
            System.out.println("Rony foi descongelado.");
        }
        else{
            System.out.println("Rony ficou congelado.");
        }




    }

}
