public class Ex1 {
	
	public static void main (String[] args) {
		
		int[][] A = new int[4][5];
		int valor = 0;
		
			for(int linha = 0;linha<A.length;linha++){
			
				for(int coluna = 0;coluna<A[linha].length;coluna++){
					valor++;
					A[linha][coluna] = valor;
					System.out.print(A[linha][coluna]+" " );
				}
				
			System.out.println();
			
			}
			
	}
}

