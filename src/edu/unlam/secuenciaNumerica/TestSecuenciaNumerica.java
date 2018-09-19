package edu.unlam.secuenciaNumerica;

import org.junit.Test;

public class TestSecuenciaNumerica {

	@Test
	public void miTest() {
		int encontrado;
		for(int i=4;i<1000;i++) {
			encontrado = SecuenciaNumerica.encontrarI(i);
			if(encontrado!=-1)
				System.out.println(encontrado);
		}
	}
}
