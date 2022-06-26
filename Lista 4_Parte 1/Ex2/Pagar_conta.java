import java.util.Scanner;
public class Pagar_conta{
	
	public static void main (String[] args) {
		int quantidade;
		double valor_total;
		char gorjeta;
		Scanner leia = new Scanner(System.in);
		Conta c1 = new Conta();
		do{
			System.out.println("Digite a quantidade de pessoas: ");
			quantidade = leia.nextInt();
			
			if(quantidade<=0){
			
				System.out.println("A quantidade de pessoas deve ser maior que 0!");
			}
		}while(quantidade<=0);
		do{
			System.out.println("Digite o valor total da conta: ");
			valor_total = leia.nextDouble();
			if(valor_total <=0){
				
				System.out.println("O valor total deve ser maior que 0!");
			}
		}while(valor_total <=0);
		do{
			System.out.println("Deseja pagar a gorjeta do garcom?(S/N)");
			gorjeta = leia.next().charAt(0);
			gorjeta = Character.toLowerCase(gorjeta);
			if(gorjeta != 's' && gorjeta!='n'){
				
				System.out.println("Por favor, Digite apenas 's' ou 'n'");
			}
		}while(gorjeta != 's' && gorjeta != 'n');
		
		c1.setGarcom((gorjeta == 's' ? true:false));
		c1.setValor_total((c1.hasGarcom() ? valor_total * 1.1:valor_total));
		c1.setQuantidade_pessoas(quantidade);
		System.out.println(c1.toString());
		
	}
}

