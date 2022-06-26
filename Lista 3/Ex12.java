import java.util.Scanner;
public class Ex12{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int primeiro = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		int segundo = leia.nextInt();
		System.out.println(Perfeitos(primeiro,segundo));
	}
	static String Perfeitos(int primeiro,int segundo){
		
		int contador = 1;
		int maior = (primeiro<segundo ? segundo:primeiro);
		int menor = (primeiro<segundo ? primeiro:segundo);
		for(int i = menor;i<maior;i++){
			contador = 1;
			for(int i2 = 2;i2<i;i2++){
				
				if(i%i2 == 0){
					
					contador+=i2;
					
				}
				
			}
			
			if(contador == i){
				
				System.out.println(contador);
				
			}
		}
		return "";
	}
}

