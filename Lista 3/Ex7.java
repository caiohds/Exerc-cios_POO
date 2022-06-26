import java.util.Scanner;
public class Ex7{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com um valor: ");
		int valor1 = leia.nextInt();
		System.out.println("Entre com outro valor: ");
		int valor2 = leia.nextInt();
		
		System.out.print(MDC(valor1, valor2));
	}
	static String MDC(int valor1, int valor2){
		int mdc = 1;
		int maior;
		maior = (valor1 > valor2 ? valor1: valor2);
		do{
		for(int i = 2;i<=maior;i++){
			
			if(valor1%i == 0 || valor2%i == 0){
				
				if(valor1%i == 0 && valor2%i == 0){
					
					mdc *=i;
					valor1 = valor1/i;
					valor2 = valor2/i;
					i = maior+1;
				}else if( valor1%i == 0 && valor2%i !=0){
					
					valor1 = valor1/i;
					i = maior+1;
				
				}else if( valor2%i == 0 && valor1%i != 0 ){
					
					valor2 = valor2/i;
					i = maior+1;
				
				}
				
			}
		
		}
		}while(valor1> 1 && valor2> 1);
		return "MDC: " + mdc;
	}
}

