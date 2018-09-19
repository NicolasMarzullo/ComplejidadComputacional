package edu.unlam.secuenciaNumerica;

import org.junit.Test;

public class TestSecuenciaNumerica {

	@Test
	public void miTest() {
		int encontrado;
		
		long startTime = System.nanoTime();
		for(int i=4;i<100000;i++) {
			
			encontrado = SecuenciaNumerica.encontrarI(i);
			if(encontrado!=-1)
				System.out.println(encontrado);
		}
		long endTime = System.nanoTime();
		double timeInSeconds = (endTime-startTime)/1000000000;
		System.out.println("Tiempo tardado: " +(endTime-startTime) + " nseg");
		System.out.println("Tiempo tardado: " + timeInSeconds + " seg");
		
	}
}
