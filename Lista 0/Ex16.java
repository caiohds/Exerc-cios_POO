import java.util.Scanner;
public class Ex16{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int N = leia.nextInt();
		int[][] O = new int[N][N];
		
		for(int linha = 0;linha<O.length;linha++){
			
			for(int coluna = 0;coluna<O[linha].length;coluna++){
				
				System.out.println("Digite o valor do elemento: ");
				O[linha][coluna] = leia.nextInt();
				
			}
		}
		
		for(int linha = 0;linha <O.length;linha++){
			
			for(int coluna = 0;coluna<O[linha].length;coluna++){
				
				if((linha-coluna)>=0){
				
					
					System.out.print(O[linha][coluna] + " ");
					
				}else{
					System.out.print(" ");
					}
				
				
			}
			System.out.println();
		}
		System.out.println("Diagonal secundaria e acima: \n");
		for(int linha = 0;linha <O.length;linha++){
			
			for(int coluna = 0;coluna<O[linha].length;coluna++){
				
				if((linha+coluna)>=(N-1) ){
				
					
					System.out.print(O[linha][coluna] + " ");
					
				}else{
					System.out.print(" ");
					}
				
				
			}
			System.out.println();
		}
	}
}
