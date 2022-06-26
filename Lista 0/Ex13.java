import java.util.Scanner;
public class Ex13{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int N = leia.nextInt();
		int[][] K = new int[N][N];
		
		for(int linha = 0;linha<K.length;linha++){
			
			for(int coluna = 0;coluna<K[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				K[linha][coluna] = leia.nextInt();
				
			}
		
		}
		
		for(int linha = 0;linha<K.length;linha++){
			
			for(int coluna = 0;coluna<K[linha].length;coluna++){
				
				if(coluna<linha){
						
					System.out.print(K[linha][coluna] + " ");
					
				}
				
			}
			System.out.println();
			
		}
	}
}


