package edu.unlam.secuenciaNumerica;

public class SecuenciaNumerica {

	public static int encontrarI(int n) {		
		if(n<3) return -1;
		double sumaIzq = 0, sumaDer=0;
		for(int i=2; i<n;i++) {
			sumaIzq = (Math.pow(i, 2)-i)/2;
			sumaDer = (Math.pow(n, 2)+n)/2 - sumaIzq -i;
			
			
			if(sumaIzq == sumaDer)
				return i;
		}
			
		return -1;
		
	}
}
