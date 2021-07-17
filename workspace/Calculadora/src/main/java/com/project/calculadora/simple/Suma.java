package com.project.calculadora.simple;

import com.project.calculadora.CalculatorManager;
import com.project.projectmanager.ProjectManager;
import java.math.BigDecimal;
import java.util.List;

/**
 * Responde a todos los tipos de calculos que involucran sumas.
 * @author fbarrios
 */
public class Suma extends CalculatorManager {

	//Defino variables principales.
	private int value1 = 0;
	private int value2 = 0;
	
	private ProjectManager pm = null;

	/**
	 * Constructor por defecto
	 * @param
	 * @author fbarrios
	 */
	public Suma() {
	}

	/**
	 * Constructor por defecto
	 * @param
	 * @author fbarrios
	 */
	public Suma(ProjectManager pm) {
		setPm(pm);
	}
	
	/**
	 * Realiza una suma con enteros
	 * @param val1
	 * @param val2
	 * @return
	 */
	public int doSuma(int val1, int val2) {
		return (val1 + val2);
	}

	/**
	 * Realiza una suma con BigDecimal, para manejo de números decimales
	 * @param val1
	 * @param val2
	 * @return
	 */
	public BigDecimal doSuma(double val1, double val2) {
		BigDecimal val_1 = new BigDecimal(val1);
		BigDecimal val_2 = new BigDecimal(val2);
		val_1 = val_1.add(val_2);
		return val_1;
	}
	
	/**
	 * Recibe una lista y suma todos sus valores, retornando un único resultado.
	 * Si el listado llega vacio retorno cero
	 * @param values
	 * @return
	 */
	public BigDecimal doSuma(List<BigDecimal> values) {
		
		BigDecimal total = new BigDecimal(0);
		
		//Valido que el listado no llegue vacio, si llega vacio retorno 0
		if (values == null ) return total;
		else 
		if (values != null ) {
			
			//Recorro el listado
			for (BigDecimal auxVal : values) {
				total = total.add(auxVal);
			}
		}
		return total;
	}
	
	
	//********************************************************************
	//***********************  Getters & Setters  ***************************
	//********************************************************************
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public ProjectManager getPm() {
		return pm;
	}
	public void setPm(ProjectManager pm) {
		this.pm = pm;
	}
}
