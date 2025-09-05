package Nivel_Iniciante.EstuturasDeCondicao;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Luke");
        System.out.println("2 - Mestre Yoda");
        System.out.println("1 - Darth Vader");
        System.out.print("Escolha um personagem: ");

        int escolhaDoUsario = input.nextInt();

        switch (escolhaDoUsario){
            case 1:
                System.out.println("Você escolheu o persoangem Luke!");
                break;
            case 2:
                System.out.println("Você escolheu o persoangem Mestre Yoda!");
                break;
            case 3:
                System.out.println("Você escolheu o persoangem Darth Vader!");
                break;
            default:
                System.out.println("ERRO! Tente novamnete e escolha um dos 3 personagens.");
                break;
        }
    input.close();
    }
}
