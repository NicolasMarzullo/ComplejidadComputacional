package edu.unlam.secuenciaNumerica;

public class SecuenciaNumerica {

	//complejidad numerica O(1)!! tiene complejidad lineal.
	public static int encontrarI(int n) {		
		if(n<3) return -1;
		
		double res = Math.sqrt((n*(n+1))/2);
		
		if(res%1==0)
			return (int)res;
		return -1;
	}
}
