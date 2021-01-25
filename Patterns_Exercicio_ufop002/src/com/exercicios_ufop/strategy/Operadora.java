package com.exercicios_ufop.strategy;

/**
 * Interface para implementa��o de c�lculo da tarifa por todas as operadoras.
 * @author Gildo Tiago Azevedo - 17.1.842
 *
 */
public interface Operadora {

	/**
	 * C�lculo da chamada realizada.
	 * @param Tempo em segundos : Integer
	 * @return Valor da chamada : double
	 */
	public double calculaTarifa(int p_DuracaoEmSegundos);
}
