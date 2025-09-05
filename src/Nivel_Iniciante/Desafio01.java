package Nivel_Iniciante;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroDeCadastros = 0;
        int opcao = 0;
        String[] pessoas = new String[10];

        while (opcao != 3){
            System.out.println("-------- MENU --------");
            System.out.println("1 - Listar Cadastros");
            System.out.println("2 - Cadastrar Usuário");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (opcao){
                case 1:
                    if(numeroDeCadastros > 0){
                        for(int c = 0; c < numeroDeCadastros; c++){
                            System.out.println(c + " - " + pessoas[c]);
                        }
                    }else{
                        System.out.println("NENHUM USUÁRIO FOI CADASTRADO!");
                    }
                    break;
                case 2:
                    if(numeroDeCadastros >= 10){
                        System.out.println("O SISTEMA EXECEDEU O NÚMERO DE CADASTROS");
                    }else{
                        System.out.print("Digite seu nome: ");
                        String nome = input.nextLine();
                        pessoas[numeroDeCadastros] = nome;
                        System.out.println("USUARIO CADASTRADO COM SUCESSO!");
                        numeroDeCadastros++;
                    }
                    break;
                case 3:
                    System.out.println("SAINDO DO SISTEMA...");
                    break;
                default:
                    System.out.println("ERRO! Escolha uma opção valida.");
                    break;
            }
            System.out.println();
        }
        input.close();
    }
}
