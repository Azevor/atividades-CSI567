package com.exercicios_ufop.strategy;

import com.exercicios_ufop.strategy.classes.OperadoraClaro;
import com.exercicios_ufop.strategy.classes.OperadoraOi;
import com.exercicios_ufop.strategy.classes.OperadoraTim;
import com.exercicios_ufop.strategy.classes.OperadoraVivo;

/**
 * Enumeração de operadoras com suas respectivas tarifas.
 * @author Gildo Tiago Azevedo - 17.1.842
 *
 */
public enum TarifaPorOperadora {

	OI,
	TIM,
	CLARO,
	VIVO;
	
	/**
	 * Tarifa referente a cada operadora.
	 * @param Operadora : TarifaPorOperadora
	 * @return Tarifa : double
	 */
	public static double getTarifaOperadora(TarifaPorOperadora p_Operadora) {
		if(p_Operadora.equals(TarifaPorOperadora.OI)) {
			return 0.32;
		}
		if(p_Operadora.equals(TarifaPorOperadora.TIM)) {
			return 0.45;
		}
		if(p_Operadora.equals(TarifaPorOperadora.CLARO)) {
			return 0.27;
		}
		if(p_Operadora.equals(TarifaPorOperadora.VIVO)) {
			return 0.19;
		}
		return -1.0;
	}
	
	/**
	 * Responsável por instanciar o objeto operadora.
	 * @param Operadora : TarifaPorOperadora
	 * @return Implementação da operadora : Object
	 */
	public static Operadora novaCobranca(TarifaPorOperadora p_Operadora) {
		if(p_Operadora.equals(TarifaPorOperadora.OI)) {
			return new OperadoraOi();
		}
		if(p_Operadora.equals(TarifaPorOperadora.TIM)) {
			return new OperadoraTim();
		}
		if(p_Operadora.equals(TarifaPorOperadora.CLARO)) {
			return new OperadoraClaro();
		}
		if(p_Operadora.equals(TarifaPorOperadora.VIVO)) {
			return new OperadoraVivo();
		}
		return null;
	}
}
