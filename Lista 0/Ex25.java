import java.util.Scanner;
public class Ex25{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int N = leia.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int M = leia.nextInt();
		int[][] Y = new int[N][M];
		int[][]Z = new int[N][M];
		
		
		for(int linha = 0;linha<Y.length;linha++){
			
			for(int coluna = 0;coluna<Y[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				Y[linha][coluna] = leia.nextInt();	
					
			}
			
		}
		
		for(int linha = 0;linha<Z.length;linha++){
			
			for(int coluna = 0;coluna<Z[linha].length;coluna++){
				int menor = 99999999;
				int proximo = 9999999;
					
					for(int linha2 = 0;linha2<Y.length;linha2++){
			
						for(int coluna2 = 0;coluna2<Y[linha2].length;coluna2++){
				
							if(menor>Y[linha2][coluna2] ){
									menor = Y[linha2][coluna2];
								
									Z[linha][coluna] = menor;
							}
							else if(Y[linha2][coluna2] <proximo && Y[linha2][coluna2] > menor){
								proximo = Y[linha2][coluna2];
								Z[linha][coluna] = proximo;
								}
						}
					}
						
			}
			
		}
		System.out.println("Matriz normal: ");
		for(int linha = 0;linha<Y.length;linha++){
			
			for(int coluna = 0;coluna<Y[linha].length;coluna++){
				
				System.out.print(Y[linha][coluna] + " ");
					
			}
				System.out.println();
		}
						
		System.out.println("Matriz crescente: ");
		
		for(int linha = 0;linha<Z.length;linha++){
			
			for(int coluna = 0;coluna<Z[linha].length;coluna++){
				
				System.out.print(Z[linha][coluna] + " ");
					
			}
				System.out.println();
		}
	}
}

