import java.util.Scanner;
public class Realizar_Pedido{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Produto pedido[] = new Produto[100];
		
		int opcao;
		int opcao2;
		int i = 0;
		int quantidade_doces =0;
		int quantidade_paes = 0;
		int quantidade_frios = 0;
		double valor_total = 0;
		do{
			System.out.println("1-Doces" + "\n2-Paes" + "\n3-Frios" + "\n0-Sair");
			opcao = leia.nextInt();
			
		switch(opcao){
		
		case 1:
			quantidade_doces++;
			do{
			System.out.println("1-sonho 2-brigadeiro 3-chocolate");
			opcao2 = leia.nextInt();
					
			switch(opcao2){
				
				case 1:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Doces(leia.nextDouble(),leia.nextDouble());
				break;
				case 2:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Doces(leia.nextDouble(),leia.nextDouble());
				break;
				case 3:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Doces(leia.nextDouble(),leia.nextDouble());
				break;
				}
			}while(opcao2<0 || opcao2>3);
			break;
		case 2:
			quantidade_paes++;
			do{
			System.out.println("1-Frances" + "\n2-Baguete" + "\n3-Pao de queijo");
			opcao2 = leia.nextInt();
			switch(opcao2){
				
				case 1:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Paes(leia.nextDouble(),leia.nextDouble());
				break;
				case 2:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Paes(leia.nextDouble(),leia.nextDouble());
				break;
				case 3:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Paes(leia.nextDouble(),leia.nextDouble());
				break;
				default:
				System.out.println("Opcao invalida!");
				break;
				}
	
			}while(opcao2<0 || opcao2>3);
			break;				
			
		case 3:
			quantidade_frios++;
			do{
			System.out.println("1-Carne x" + "\n2-Carne y" + "3-\nCarne z");
			opcao2 = leia.nextInt();
			switch(opcao2){
				
				case 1:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Frios(leia.nextDouble(),leia.nextDouble());
				break;
				case 2:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Frios(leia.nextDouble(),leia.nextDouble());
				break;
				case 3:
				System.out.println("Digite a quantidade e o valor: ");
				pedido[i] = new Frios(leia.nextDouble(),leia.nextDouble());
				break;
				default:
				System.out.println("Opcao invalida!");
				break;
				
				}
			}while(opcao2<0 || opcao2>3);
			break;				
			case 0:
			System.out.println("Fim!");
			break;
		default:
			System.out.println("Opcao invalida!");
			break;
		}
		System.out.println("opcao: " + opcao);
		if(opcao>0 && opcao<=3){
			valor_total += pedido[i].valor_final();
			System.out.println("Valor parcial: " + valor_total);
			
			i++;
		}
		}while(opcao!= 0 );
		System.out.println("Quantidade de frios: " + quantidade_frios + "\nQuantidade de doces: " + quantidade_doces + "\nQuantidade de paes: " + quantidade_paes);
		System.out.println("Valor final: " + valor_total);
	}
}

