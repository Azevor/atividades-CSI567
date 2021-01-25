package com.exercicios_ufop.strategy.classes;

import com.exercicios_ufop.strategy.Operadora;
import com.exercicios_ufop.strategy.TarifaPorOperadora;

/**
 * Implementa��o da operadora OI.
 * @author Gildo Tiago Azevedo - 17.1.842
 *
 */
public class OperadoraOi implements Operadora {

	@Override
	public double calculaTarifa(int p_DuracaoEmSegundos) {
		return new Double(p_DuracaoEmSegundos).doubleValue()/60*TarifaPorOperadora.getTarifaOperadora(TarifaPorOperadora.OI);
	}

}
