import java.util.Scanner;
import java.util.Arrays;
public class Ex22{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas: ");
		int N = leia.nextInt();
		System.out.println("Digite a quantidade de colunas da primeira matriz: ");
		int M = leia.nextInt();
		System.out.println("Digite a quantidade de colunas da segunda matriz: ");
		int P = leia.nextInt();
		int[][] m1 = new int[N][M];
		int[][] m2 = new int[N][P];
		int[][] m3 = new int[N][P+M];
		
		for(int linha = 0;linha<m1.length;linha++){
			
			for(int coluna = 0;coluna<m1[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				m1[linha][coluna] = leia.nextInt();
			
			}
		}
		
		for(int linha = 0;linha<m2.length;linha++){
			
			for(int coluna = 0;coluna<m2[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				m2[linha][coluna] = leia.nextInt();
			
			}
		}
		
		for(int linha = 0;linha<m3.length;linha++){
				int cont = 0;
				int cont2 = 0;
				
			for(int coluna = 0;coluna<m3[linha].length;coluna++){
				
				
				if(coluna%2 == 0){
					if(coluna==0){
						m3[linha][coluna] = m1[linha][coluna];
						
						
						
					}else{ 
						cont++;
					m3[linha][coluna] = m1[linha][coluna-cont];
				}
				
				}else{
					
					
						cont2++;
					m3[linha][coluna] = m2[linha][coluna-cont2];
		
					}
				System.out.print(m3[linha][coluna] + " ");
			
			}
				System.out.println();
		}
		
	}
}

