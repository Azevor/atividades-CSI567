package com.exercicios_ufop.strategy;

import java.text.DecimalFormat;

/**
 * Classe principal para teste.
 * @author Gildo Tiago Azevedo - 17.1.842
 *
 */
public class Teste {

	public static void main(String[] args) {
		Operadora novaChamada = null;
		DecimalFormat df = new DecimalFormat("0.00");
		
		novaChamada = TarifaPorOperadora.novaCobranca(TarifaPorOperadora.TIM);
		System.out.println("Valor da chamada = R$ " + df.format(novaChamada.calculaTarifa(206)));
		
		novaChamada = TarifaPorOperadora.novaCobranca(TarifaPorOperadora.CLARO);
		System.out.println("Valor da chamada = R$ " + df.format(novaChamada.calculaTarifa(495)));
		
		novaChamada = TarifaPorOperadora.novaCobranca(TarifaPorOperadora.OI);
		System.out.println("Valor da chamada = R$ " + df.format(novaChamada.calculaTarifa(260)));
		
		novaChamada = TarifaPorOperadora.novaCobranca(TarifaPorOperadora.VIVO);
		System.out.println("Valor da chamada = R$ " + df.format(novaChamada.calculaTarifa(300)));
	}
}
