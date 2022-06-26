import java.util.Scanner;
public class Ex6{
	
	public static void main (String[] args) {
		System.out.println("O menor valor e: " + menor());
	}
		static int menor(){
			Scanner leia = new Scanner(System.in);
			int menor = 9999999;
			int contador = 0;
			char resposta;
			do{
			System.out.println("Digite um valor: ");
			int valor = leia.nextInt();
		
				if(menor > valor){
			
					menor = valor;
		
				}
			
			System.out.println("Deseja continuar?(s/n)");
			resposta = leia.next().charAt(0);	
		}while(resposta == 's');
			return menor;
		}
}


