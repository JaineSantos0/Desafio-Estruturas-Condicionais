package com.jainejosiane;

/*
Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5
reais, cada refrigerante 3 reais e cada espetinho custa 7. Além disso, o bar cobra uma taxa de
couvert artístico no valor de 4 reais, porém, se o valor gasto com consumo for superior a 30 reais,
o couvert artístico não é cobrado. Fazer um programa para ler os seguintes dados de um cliente do
bar: sexo (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos. O programa
deve então mostrar um relatório com a conta a ser paga pelo cliente.
 */

import java.util.Scanner;

public class ProgramaBar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Sexo: ");
        String sexo = sc.next();

        System.out.println("Digite a quantidade de cervejas: ");
        int quantidadeCerveja = sc.nextInt();

        System.out.println("Digite a quantidade de refrigerantes: ");
        int quantidadeRefrigerante = sc.nextInt();

        System.out.println("Digite a quantidade de espetinhos: ");
        int quantidadeEspetinho = sc.nextInt();

        double consumo = quantidadeCerveja * 5.00 + quantidadeRefrigerante * 3.00 + quantidadeEspetinho * 7.00;

        System.out.println("*****Relatório*****");

        if (consumo<30.00) {
            System.out.println("Consumo= R$" + consumo);
            double couvertArtistico = 4.00;
            System.out.println("Couvert Artístico= R$" + couvertArtistico);
        } else {
            System.out.println("Consumo= R$" + consumo);
            System.out.println("Isento de Couvert");
        }

        if (sexo.contains("F".toLowerCase())) {
            double ingresso = 8.00;
            System.out.println("Ingresso= R$" + ingresso);

            double total = consumo + ingresso;
            System.out.println();
            System.out.println("Valor total= R$" + total);

        } else if (sexo.contains("M".toLowerCase())) {
            double ingresso = 10.00;
            System.out.println("Ingresso= R$" + ingresso);
            double total = consumo + ingresso;

            System.out.println();
            System.out.println("Valor total= R$" + total);
        } else {
            System.out.println("Sexo inválido");
        }

        sc.close();
    }
}