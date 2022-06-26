import java.util.Scanner;
public class Ex10{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int N = leia.nextInt();
		int[][] H = new int[N][N];
		
			for(int linha = 0;linha<H.length;linha++){
				
				for(int coluna = 0;coluna<H[linha].length;coluna++){
					
					System.out.println("Digite um valor: ");
					H[linha][coluna] = leia.nextInt();
					
				}				
			}
			
			System.out.println();
			System.out.print("Dimensao secundaria: ");
			
			for(int linha = 0;linha<H.length;linha++){
				
				for(int coluna = 0;coluna<H[linha].length;coluna++){
					
					if((coluna + linha)+2 == (N+1)){
						
						System.out.print(H[linha][coluna]+ " ");
					
					}					
				}				
			}
	}
}

