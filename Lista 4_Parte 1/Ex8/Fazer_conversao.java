import java.util.Scanner;
public class Fazer_conversao{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Conversao c1 = new Conversao();
		int opcao;
		int valor;
		do{
			System.out.println("-------------Opcoes-------------------");
			System.out.println("1-Metros quadrados para pes quadrados" + "\n2-Pes quadrados para metros quadrados" + "\n3-Pe quadrado para centimetro quadrados" + "\n4-Centimetros quadrados para pe quadrado"
			+ "\n5-Milha quadrada para acres" + "\n6- Acres para milha quadrada" + "\n7-Acre para pes quadrados" + "\n8-Pes quadrados para acre");
			opcao = leia.nextInt();
			
			switch(opcao){
				case 1:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 2:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 3:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 4:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 5:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 6:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 7:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				case 8:
				System.out.println("Digite o valor: ");
				valor = leia.nextInt();
				System.out.println("Valor convertido: " +c1.conversao(valor,opcao));
				break;
				default:
				System.out.println("Opcao Invalida!");
			
			}
		}while(opcao <=0 || opcao >8);
	}
}

