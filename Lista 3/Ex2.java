import java.util.Scanner;
public class Ex2{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		char resposta;
		int temperatura;
		do{
			System.out.println("[C]Celsius, [F]Fahrenheit e [S]Sair");
			resposta = leia.next().charAt(0);
			resposta = Character.toLowerCase(resposta);
			if(resposta == 'c'){
				
				System.out.println("Digite o valor da temperatura em Celsius: ");
				temperatura = leia.nextInt();
				System.out.println(Temperatura(resposta,temperatura));
			}
			else if(resposta == 'f'){
				
				System.out.println("Digite o valor da temperatura em Fahrenheit: ");
				temperatura = leia.nextInt();
				System.out.println(Temperatura(resposta,temperatura));
			}else if(resposta !='s'){
				
				System.out.println("Resposta invalida!");
				
			}
		}while(resposta!= 's');
	}
	static String Temperatura(char resposta, int temperatura){
		int temperatura_convertida;
		if(resposta == 'f'){
			
			temperatura_convertida = (5* ( temperatura - 32))/9;
			
			return "Temperatura convertida para Fahrenheit: " + temperatura_convertida;
			
		}else{
			
			temperatura_convertida = ((temperatura * 9)/5)+32;
			
			return "Temperatura convertida para Fahrenheit: " + temperatura_convertida;
		}
		
	}
}

