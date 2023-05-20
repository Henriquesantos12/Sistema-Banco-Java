package com.br;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();
            System.out.println("Olá " + nome);

            boolean senhaJaInformada = false;
            while (!senhaJaInformada) {
            System.out.println("Digite sua senha:");
            int inserirSenha = sc.nextInt();
            if (inserirSenha != 2678) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                System.out.println("Acesso Liberado!");
                senhaJaInformada = true;
            }
        }
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Depositar ");
        System.out.println("2 - Sacar ");
        System.out.println("3 - Sair ");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite um valor:");
                BigDecimal deposito =  sc.nextBigDecimal();
                System.out.println("Deseja realizar um outro depósito? s/n");
                char response = sc.next().charAt(0);

                if (response == 's') {
                    System.out.print("Digite o valor: ");
                    BigDecimal deposito2 = sc.nextBigDecimal();
                    BigDecimal resultado = deposito.add(deposito2);
                    System.out.println("Saldo atual: " + resultado );
                }
//                else {
//                    dados = new DadosBanco (numConta, nome);
//                }
//                System.out.println(dados);
//
//                System.out.print("Entre com deposito: ");
//                double deposito = sc.nextDouble();
//                dados.deposit(deposito);
//                System.out.println("Conta atualizada:");
//                System.out.println(dados);
//                System.out.print("Saque: ");
//                double saque = sc.nextDouble();
//                dados.saque(saque);
//                System.out.println(dados);
//
//                sc.close();
//        }
                break;
        }

        sc.close();
    }
}
