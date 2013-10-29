package palavraCruzada;

public class PalavraCruzada {
	
	int matriz[][];
	int tamanhoI = 5;
	int tamanhoJ = 8;
	int contador = 1;
	public PalavraCruzada(int[][] matriz, int tamanhoI, int tamanhoJ) {
		super();
		this.matriz = matriz;
		this.tamanhoI = tamanhoI;
		this.tamanhoJ = tamanhoJ;
	}
	
	//matriz[][] = matriz[tamanho][tamanho];
	
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


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}

	public int transformaMatriz (int i, int j){
		for (i=0;i<tamanhoI;i++) {
			for(j=0;j<tamanhoJ;j++){
				if(matriz[i][j] == -1) continue;
				else{
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
					if((0 < i && i < tamanhoI-1 && j == tamanhoJ-1) && (matriz[i-1][j] == -1 && matriz[1+1][j] == 0)){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
					if((0 < i && i < tamanhoI-1 && 0 < j && j < tamanhoJ-1) && ((matriz[i-1][j] == -1 && matriz[i+1][j] == 0) || (matriz[i][j-1] == -1 && matriz[i][j+1] == 0))){
						matriz[i][j] = contador;
						contador = contador + 1;
					}
				}
			}
		
		}
		return matriz [tamanhoI][tamanhoJ];
	}
	
	

}
