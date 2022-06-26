import java.util.Scanner;
public class Ex8{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de termos: ");
		int quantidade = leia.nextInt();
		System.out.println(MDC(quantidade));
		
	}
	static String MDC(int quantidade){
		int termos[] = new int[quantidade];
		int mdc = 1;
		int maior = 0;
		Scanner leia = new Scanner(System.in);
		for(int i = 0; i<termos.length;i++){
			
			System.out.println("Digite o valor: ");
			termos[i] = leia.nextInt();
			if(termos[i] > maior){
				
				maior = termos[i];
			
			}
		}
						
			
				int ultimo_div = 0;
				for(int i = 0;i<termos.length;i++){
					int divididos = 0;
					
					for(int div = 2; div<=maior;div++){
					if(termos[i]%div == 0){
					
						divididos++;
						termos[i] = termos[i]/div;
						div = maior;
						ultimo_div = div;
						i = 0;
						
					}
					
				
				}
						if(divididos == termos.length){
				
							mdc *= ultimo_div;
				
							}
				
			}
			
			
		
		for(int i = 0; i<termos.length;i++){
			
			System.out.print(termos[i] + " "); 
		
		}
		return "\nMDC: " + mdc ;
	}	

}

