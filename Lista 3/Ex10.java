import java.util.Scanner;
public class Ex10{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de termos: ");
		int quantidade = leia.nextInt();
		System.out.println("MMC: " + MMC(quantidade));
	}
	static int MMC(int quantidade){
		Scanner leia = new Scanner(System.in);
		int numero[] = new int[quantidade];
		int mmc = 1;
		int maior = 0;
		for(int i = 0; i<numero.length;i++){
			
			System.out.println("Digite o " + (i+1) + " termo: ");
			numero[i] = leia.nextInt();
			if(numero[i] > maior){
				
				maior = numero[i];
				
			}
		}
		int finalizados;
		int divisor =2;
		do{
				finalizados = 0;
				int divididos = 0;
					for(int i = 0;i<numero.length;i++){
					
						if(numero[i]%divisor == 0){
						
							numero[i] = numero[i]/divisor;
							divididos++;
							
						}
						
						
						
					}
					if(divididos>0){
						
						mmc *=divisor;
						divisor = 2;
						
					}else{
					
						divisor++;
						
					}
				
			
			
		
			for(int i = 0;i<numero.length;i++){
			
				if(numero[i] == 1){
					
					finalizados++;
				
				}
			
			}
		}while(finalizados < numero.length);
		return mmc;
		
	}
}

