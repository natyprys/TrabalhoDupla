package atividades;

import java.util.Scanner;

public class TrabalhoEmDupla2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" -------------------- DevHub - Cadastro de devs -----------------------");
        System.out.println("Escolha uma das opções: \n1.Números Pares  \n2.Números ímpares  \n3.Números primos \n4.Juros Compostos  \n5.Sair\n ");
        short opcao = scanner.nextShort();
        scanner.nextLine();

        int num1= 0;

        switch (opcao) {
            case 1:
                //_ Na opção de números pares, o usuário poderá digitar um valor e o sistema exibirá todos os números pares de zero até o valor que o usuário digitou.
                System.out.println("Números Pares");

                do {
                    System.out.println("\n Digite um número par");
                    num1 = scanner.nextInt();
                    if (num1 % 2 != 0) {
                        System.out.print("Número informado é inválido");

                        }

                } while (num1 % 2 != 0);

                for (int i = 0; i <= num1; i += 2) {
                    System.out.println(i);
                }

                System.out.print("Programa finalizado");
                break;


            case 2:
                //_ Na opção de números ímpares, o usuário deverá digitar um valor e o sistema exibirá todos os números ímpares de zero até o valor digitado pelo usuário.
                System.out.println("Números Impares");

                do {
                    System.out.println("\n Digite um número impar");
                    num1 = scanner.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.print("Número informado é inválido");
                    }

                } while (num1 % 2 == 0);

                for (int i = 1; i <= num1; i += 2) {
                    System.out.println(i);
                }

                System.out.print("Programa finalizado");
                break;


            case 3:
                //_ Na opção dos números primos, o sistema deve solicitar que o usuário digite um número e dizer quais são os números primos de zero ao valor digitado pelo usuário.
                System.out.println("Números Primos");

                    System.out.println("\n Digite um número:");
                    num1 = scanner.nextInt();

                    for (int i = 0; i <= num1; i++) {
                        boolean primo = true;
                        for (int numero = 2; numero < i; numero++)
                            if (i % numero == 0) {
                                primo = false;
                            }
                        if (primo) {
                            System.out.println(i);
                        }
                    }


            case 4:
                System.out.println("Juros Compostos");
                // Para o calculo do juros, o sistema deve solicitar ao usuário que digite o valor do investimento, o prazo e a taxa de juros mensal. O sistema deve imprimir o retorno mês a mês e o montante para resgate ao final do prazo.
                System.out.println("Digite o valor do investimento");
                double investimento = scanner.nextDouble();
                System.out.println("Digite o periodo do investimento");
                int periodo = scanner.nextInt();
                System.out.println("Digite a taxa de juros mensal");
                double juros = scanner.nextDouble();


                for(int i =1; i<= periodo; i++){
                    investimento += investimento * (juros/100);
                    System.out.printf("Mes %d: Valor do montante %2f \n",i,investimento);
                }


            case 5:
                System.out.println("Aplicação finaliza. Sair");
                break;

            default:
                System.out.println("Opção inválida. Digite novamente");

        }


    }
}