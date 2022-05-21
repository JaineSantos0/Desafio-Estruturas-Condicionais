package com.jainejosiane;

/*
Fazer um programa para ler quanto a pessoa obteve de renda anual com salário, prestação de serviço e
ganho de capital. Leia também quando a pessoal teve de gastos médicos e educacionais no ano. Seu
programa deverá então produzir um relatório de imposto de renda dessa pessoa conforme exemplos.
Considere a renda mensal com salário como sendo a renda anual dividida por 12.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramaImposto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salário: ");
        double rendaAnualSalario = sc.nextDouble();

        System.out.println("Renda anual com prestação de serviço: ");
        double rendaAnualPrestacaoServico = sc.nextDouble();

        System.out.println("Renda anual com ganho de capital: ");
        double rendaAnualGanhoCapital = sc.nextDouble();

        System.out.println("Gastos médicos: ");
        double gastosMedicosAnuais = sc.nextDouble();

        System.out.println("Gastos educacionais: ");
        double gastosEducacionaisAnuais = sc.nextDouble();

        System.out.println();
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA: ");

        double rendaMensalSalario = rendaAnualSalario / 12;
        double rendaMensalPrestacaoServico = rendaAnualPrestacaoServico / 12;
        double rendaMensalGanhoCapital = rendaAnualGanhoCapital / 12;

        double impostoSalario = 0;
        if (rendaMensalSalario < 3000.00) {
            double imposto = 0.00;
            System.out.printf("Imposto sobre salário: R$ %.2f",imposto);
            impostoSalario += imposto;
        } else if (rendaMensalSalario > 3000.00 || rendaMensalSalario < 5000.00) {
            double imposto = 0.10;
            double valorImpostoAnual = (rendaMensalSalario * imposto) * 12;
            System.out.printf("Imposto sobre salário: R$ %.2f",valorImpostoAnual);
            impostoSalario += valorImpostoAnual;
        } else {
            double imposto = 0.20;
            double valorImpostoAnual = (rendaMensalSalario * imposto) * 12;
            System.out.printf("Imposto sobre salário: R$ %.2f",valorImpostoAnual);
            impostoSalario += valorImpostoAnual;
        }

        double impostoPrestacaoServico = 0;
        if (rendaMensalPrestacaoServico != 0.00) {
            double imposto = 0.15;
            double valorImpostoAnual = (rendaMensalPrestacaoServico * imposto) * 12;
            System.out.println();
            System.out.printf("Imposto sobre serviços: R$ %.2f",valorImpostoAnual);
            impostoPrestacaoServico += valorImpostoAnual;
        } else {
            double imposto = 0.00;
            System.out.println();
            System.out.printf("Imposto sobre serviços: R$ %.2f",imposto);
            impostoPrestacaoServico += imposto;
        }

        double impostoGanhocapital = 0;
        if (rendaMensalGanhoCapital != 0.00) {
            double imposto = 0.20;
            double valorImpostoAnual = (rendaMensalGanhoCapital * imposto) * 12;
            System.out.println();
            System.out.printf("Imposto sobre ganho de capital: R$ %.2f",valorImpostoAnual);
            impostoGanhocapital += valorImpostoAnual;
        } else {
            double imposto = 0.00;
            System.out.println();
            System.out.printf("Imposto sobre ganho de capital: R$ %.2f",imposto);
            impostoGanhocapital += imposto;
        }

        System.out.println("DEDUÇÕES: ");

        double maximoDedutivel = (impostoSalario + impostoPrestacaoServico + impostoGanhocapital) * 30 / 100;
        System.out.printf("Máximo dedutível: R$ %.2f",maximoDedutivel);

        double gastosDedutiveis = gastosMedicosAnuais + gastosEducacionaisAnuais;
        System.out.println();
        System.out.printf("Gastos dedutíveis: R$ %.2f",gastosDedutiveis);

        System.out.println("RESUMO: ");

        double impostoTotal = impostoSalario + impostoPrestacaoServico + impostoGanhocapital;
        System.out.printf("Imposto bruto total: R$ %.2f",impostoTotal);

        double abatimentoImposto = 0;
        if (gastosDedutiveis > maximoDedutivel) {
            abatimentoImposto += maximoDedutivel;
            System.out.println();
            System.out.printf("Abatimento: R$ %.2f",abatimentoImposto);
        } else {
            abatimentoImposto += gastosDedutiveis;
            System.out.println();
            System.out.printf("Abatimento: R$ %.2f",abatimentoImposto);
        }

        double impostoDevido = impostoTotal - abatimentoImposto;
        System.out.println();
        System.out.printf("Imposto devido: R$ %.2f",impostoDevido);

        sc.close();
    }
}