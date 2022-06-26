import java.util.Scanner;
public class Usar_lampada3{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		char estado;
		Lampada3 l1 = new Lampada3();
		do{
			System.out.println("Digite o estado da lampada (A) caso esteja acesa, (D) caso esteja apagada e (M) caso esteja meia-luz: ");
			estado = leia.next().charAt(0);
			estado = Character.toLowerCase(estado);
			if(estado !='a' && estado !='d' && estado !='m'){
				
				System.out.println("Valor inválido!");
			}
		}while(estado !='a' && estado !='d' && estado !='m');
		l1.setEstado(estado);
		System.out.println(l1.toString());
	}
}

