public class Ex2 {
	
	public static void main (String[] args) {
		
		int[][] B = new int[6][3];
		int valor;
		
			for(int linha = 0;linha<B.length;linha++){
				
				for(int coluna = 0;coluna<B[linha].length;coluna++){
					valor = (int)(Math.random()*100);
					B[linha][coluna] = valor;
					System.out.print(B[linha][coluna] + " ");
				}
				
			System.out.println();
			
			}
		
	}
}

