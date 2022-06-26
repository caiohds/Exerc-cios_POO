import java.util.Scanner;
public class Aluguel{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Cliente clientes[] = new Cliente[10];
		Midia midias[] = new Midia[10];
		Midia_cliente midia_cliente[] = new Midia_cliente[10];
		int opcao;
		int i = 0;
		int i2 = 0;
		int i3 = 0;
		double valor_total = 0;
		do{
			System.out.println("1-Cadastrar novo cliente" + "\n2-Cadastrar nova midia" + "\n3-Alugar midia" + "\n4-Devolver Midia" + "\n5-Consultar aluguel do cliente"+"\n6-Consultar valor total a receber" +"\n0-Finalizar");
			opcao = leia.nextInt();
		switch(opcao){
			case 1:
				System.out.println("Digite o nome e a idade do cliente: ");
				clientes[i] = new Cliente(i,leia.next(),leia2.nextInt());
				i++;
			break;
			case 2:
				System.out.println("1-Filme" + " 2-Livro" + " 3-Jogo");
				int opcao2 = leia.nextInt();
				switch(opcao2){
					case 1:
						System.out.println("Digite o titulo, tipo, genero, valor, classificacao e duracao: ");
						midias[i2] = new Filme(i2,leia.next(),leia2.next(),leia.next(),leia2.nextDouble(),leia.next(),leia2.nextInt());
						i2++;
						break;
					case 2:
						System.out.println("Digite o titulo,tipo,genero,valor, autor, editora, edicao");
						midias[i2] = new Livro(i2,leia.next(),leia2.next(),leia.next(),leia2.nextDouble(),leia.next(),leia2.next(),leia.nextInt());
						i2++;
						break;
					case 3:
						System.out.println("Digite o titulo,tipo,genero,valor e o console");
						midias[i2] = new Jogo(i2,leia.next(),leia2.next(),leia.next(),leia2.nextDouble(),leia.next());
						i2++;
						break;
					default:
						System.out.println("Opcao invalida!");
						break;
				}
			break;
			case 3:
				System.out.println("Digite o codigo do cliente que deseja alugar e o codigo da midia: ");
				midia_cliente[i3] = new Midia_cliente(clientes[leia.nextInt()],midias[leia2.nextInt()]);
				valor_total += midia_cliente[i3].getValorMidia();
				i3++;
			break;
			case 4:
				System.out.println("Digite o codigo do aluguel: ");
				midia_cliente[leia.nextInt()] = null;
			break;
			case 5:
				double valor_a_pagar = 0;
				System.out.println("Digite o codigo do cliente: ");
				int codigo = leia.nextInt();
				for(int indice = 0; indice<midia_cliente.length;indice++){
					
					if(midia_cliente[indice] != null){
						
						if(midia_cliente[indice].getCodigoCliente() == codigo){
							
							
							valor_a_pagar += midia_cliente[indice].getValorMidia();
						}
					}
				}
				System.out.println("Valor a pagar: " + valor_a_pagar);
				break;
			case 6:
				System.out.println("Valor total a receber hoje: " + valor_total);
				break;
			case 0:
			System.out.println("Sistema finalizado!");
			break;
			default:
			System.out.println("Opcao invalida!");
			break;
		}
		}while(opcao !=0);
		
	}
}

