package palavraCruzada;

public class PalavraCruzada {
	
	int tamanhoI;
	int tamanhoJ;
	int [][] matriz;
	
	public PalavraCruzada( int tamanhoi, int tamanhoj) {
		tamanhoI = tamanhoi;
		tamanhoJ = tamanhoj;
		matriz = new int [tamanhoI][tamanhoJ];
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int getTamanhoI() {
		return tamanhoI;
	}


	public void setTamanhoI(int tamanhoI) {
		this.tamanhoI = tamanhoI;
	}
	
	public int getTamanhoJ() {
		return tamanhoJ;
	}


	public void setTamanhoJ(int tamanhoJ) {
		this.tamanhoJ = tamanhoJ;
	}

	public int [][] transformaMatriz (){
		int i, j;
		int contador = 1;
		
		for (i=0;i<tamanhoI;i++) {
			for(j=0;j<tamanhoJ;j++){
				if(matriz[i][j] == -1){
					matriz[i][j] = -1;
				}else{
					if(((i == 0 && j == 0)) && ((matriz[i+1][j] == 0 || matriz[i][j+1] == 0))){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((i == 0 && 0 < j && j < tamanhoJ-1) && (matriz[i+1][j] == 0 || (matriz[i][j+1] == 0 && matriz[i][j-1] == -1))){
						matriz[i][j] = contador;
						contador = contador + 1;				
					}
					if((i == 0 && j == tamanhoJ-1) && (matriz[i+1][j] == 0)){
						matriz[i][j] = contador;
						contador = contador + 1;						
					}
					if((0 < i && i < tamanhoI-1 && j == 0) && (matriz[i][j+1] == 0 || (matriz[i+1][j] == 0 && matriz[i-1][j] == -1))){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((i == tamanhoI-1 && j == 0) && (matriz[i][j+1] == 0)){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((i == tamanhoI-1 && 0 < j && j < tamanhoJ-1) && (matriz[i][j-1] == -1 && matriz[i][j+1] == 0)){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((0 < i && i < tamanhoI-1 && j == tamanhoJ-1) && (matriz[i-1][j] == -1 && matriz[i+1][j] == 0)){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((0 < i && i < tamanhoI-1 && 0 < j && j < tamanhoJ-1) && ((matriz[i-1][j] == -1 && matriz[i+1][j] == 0) || (matriz[i][j-1] == -1 && matriz[i][j+1] == 0))){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
				}
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		return matriz;
	}
	
	

}
