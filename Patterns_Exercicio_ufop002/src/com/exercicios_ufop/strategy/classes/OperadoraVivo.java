package com.exercicios_ufop.strategy.classes;

import com.exercicios_ufop.strategy.Operadora;
import com.exercicios_ufop.strategy.TarifaPorOperadora;

/**
 * Implementação da operadora VIVO.
 * @author Gildo Tiago Azevedo - 17.1.842
 *
 */
public class OperadoraVivo implements Operadora {

	@Override
	public double calculaTarifa(int p_DuracaoEmSegundos) {
		return new Double(p_DuracaoEmSegundos).doubleValue()/60*TarifaPorOperadora.getTarifaOperadora(TarifaPorOperadora.VIVO);
	}

}
