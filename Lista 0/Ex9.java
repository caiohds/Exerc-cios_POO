import java.util.Scanner;
public class Ex9{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a dimensao: ");
		int dimensao = leia.nextInt();
		int[][] G = new int[dimensao][dimensao];
		
			for(int linha = 0;linha<G.length;linha++){
				
					for(int coluna = 0;coluna<G[linha].length;coluna++){
						
							System.out.println("Digite um valor: ");
							G[linha][coluna] = leia.nextInt();
						
					}
			}
			
			System.out.println();
			System.out.print("Diagonal principal: ");
			
			for(int linha = 0;linha<G.length;linha++){
				
					for(int coluna = 0;coluna<G[linha].length;coluna++){
						
							if(linha == coluna){
								
								System.out.print(G[linha][coluna] + " ");
								
							}
					}
			}
	}
}

