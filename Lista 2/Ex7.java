import java.util.Scanner;
import java.util.Random;
public class Ex7{
	
	public static void main (String[] args) {
		System.out.println(dado());
	}
	static String dado(){
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		int dado = 0;
		char resposta;
			do{
				
				System.out.println("Jogar dado?(s/n)");
				resposta = leia.next().charAt(0);
			
				if(resposta == 's'){
				
					dado = random.nextInt(6)+1;			
					System.out.println("Saiu: " + dado);
					
				}
				
			}while(resposta =='s');
			
		return "";
	}
}

