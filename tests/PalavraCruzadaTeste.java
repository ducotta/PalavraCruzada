package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import palavraCruzada.PalavraCruzada;

public class PalavraCruzadaTeste {
	
	PalavraCruzada umaPalavraCruzada;

	@Before
	public void setUp() throws Exception {
		umaPalavraCruzada = new PalavraCruzada(5, 8);
	}

	@Test
	public void transformaMatrizTeste() {
		int matrizTeste[][] = {{0,-1,0,-1,-1,0,-1,0},
							   {0,0,0,0,-1,0,0,0},
							   {0,0,-1,-1,0,0,-1,0},
							   {-1,0,0,0,0,-1,0,0},
							   {0,0,-1,0,0,0,-1,-1}};
		umaPalavraCruzada.setMatriz(matrizTeste);
		umaPalavraCruzada.transformaMatriz();
		
		int matrizEsperada[][] = {{1,-1,2,-1,-1,3,-1,4},
				   				 {5,6,0,0,-1,7,0,0},
				   				 {8,0,-1,-1,9,0,-1,0},
				   				 {-1,10,0,11,0,-1,12,0},
				   				 {13,0,-1,14,0,0,-1,-1}};
		assertEquals(true,umaPalavraCruzada.getMatriz().equals(matrizEsperada));
				
	}

}
