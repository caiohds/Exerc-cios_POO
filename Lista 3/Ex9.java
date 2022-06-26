import java.util.Scanner;
public class Ex9{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int primeiro_numero = leia.nextInt();
		System.out.println("Digite outro numero: ");
		int segundo_numero = leia.nextInt();
		System.out.println("MMC: " + MMC(primeiro_numero,segundo_numero));
	}
	static int MMC(int primeiro_numero,int segundo_numero){
		int numero[] = new int[2];
		int mmc = 1;
		numero[0] = primeiro_numero;
		numero[1] = segundo_numero;
		int maior = (primeiro_numero >segundo_numero ? primeiro_numero:segundo_numero);
		
		do{
			
				
					
					for(int divisor = 2;divisor<=maior;divisor++){
						
						if(numero[0]%divisor == 0 && numero[1]%divisor==0){
							
							numero[0] = numero[0]/divisor;
							numero[1] = numero[1]/divisor;
							mmc *=divisor;
							divisor = maior+1;
					
						}else if(numero[0]%divisor == 0){
							
							
							numero[0] = numero[0]/divisor;
							mmc *=divisor;
							divisor = maior+1;
							
						}else if(numero[1]%divisor == 0){
							
							
							numero[1] = numero[1]/divisor;
							mmc *=divisor;
							divisor = maior+1;
							
						}
						
					}
		}while(numero[0] > 1 || numero[1] > 1);
		return mmc;
	}
}

