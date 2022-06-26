import java.util.Scanner;
public class Ex3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		char opcao;
		
		do{
			
			System.out.println("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair");
			opcao = leia.next().charAt(0);
			opcao = Character.toLowerCase(opcao);
			if(opcao == 'c'){
				
				System.out.println("Digite o valor da temperatura em Celsius: ");
				int temperatura = leia.nextInt();
				System.out.println(Temperatura(opcao,temperatura));
				
			}else if(opcao == 'f'){
				
				System.out.println("Digite o valor da temperatura em Fahrenheit: ");
				int temperatura = leia.nextInt();
				System.out.println(Temperatura(opcao,temperatura));
			
			}else if(opcao == 'k'){
				
				System.out.println("Digite o valor da temperatura em Kelvin: ");
				int temperatura = leia.nextInt();
				System.out.println(Temperatura(opcao,temperatura));
				
			}else if(opcao != 's'){
				
				System.out.println("Opcao invalida!");
				
				}		
		}while(opcao != 's');
	}
	static String Temperatura(char opcao,int temperatura){

		if(opcao == 'c'){
			
			return "Temperatura em Kelvin: " + (temperatura + 273) 
			+ "\nTemperatura em Fahrenheit: " + (((9* temperatura)/5)+32);
			
		}else if(opcao == 'f'){
			
			return "Temperatura em Celsius: " + ((5*(temperatura -32))/9) 
			+ "\nTemperatura em Kelvin: " + ((((temperatura - 32)*5)/9)+273);
			
		}else{
			
			return "Temperatura em Celsius: " + (temperatura - 273) 
			+ "\nTemperatura em Fahrenheit: " + ((((temperatura - 273)*9)/5)+32); 
			
		}	
	}
}

