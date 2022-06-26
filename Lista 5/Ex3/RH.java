import java.util.Scanner;
public class RH{
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Scanner leia3 = new Scanner(System.in);
		Candidatos candidatos[] = new Candidatos[3];
		Vagas vagas[] = new Vagas[3];
		CandidatosVaga candidatosVaga[] = new CandidatosVaga[9];
		int opcao;
		int candidato = 0;
		char situacao;
		char tipo_vaga;
		int i = 0;
		int i2 = 0;
		int i3 = 0;
		do{
		System.out.println("1-Cadastrar candidatos" + "\n2-Cadastrar Vagas:" + "\n3-Cadastrar Candidato x Vaga" + "\n4-Visualizar Vagas" + "\n5-Visualizar Candidatos" +"\n6-Candidatos x vaga" + "\n0-sair");
		opcao = leia.nextInt();	
		switch(opcao){
		case 1:
			System.out.println("Dempregedado ou Empregado(D/E)");
			situacao = leia.next().charAt(0);
			situacao = Character.toLowerCase(situacao);
			if(situacao == 'd'){
				if(i<candidatos.length){
				System.out.println("Digite o seu nome: ");
				System.out.println("Digite sua idade: ");
				System.out.println("Tempo desempregado: ");
				candidatos[i] = new Desempregados(leia.next(),leia2.nextInt(),leia2.nextInt());
				i++;
				}else{
					System.out.println("Numero maximo de candidatos foi preenchido");
				}
			}else if(situacao == 'e'){
				if(i<candidatos.length){
				System.out.println("Digite o seu nome: ");
				System.out.println("Digite sua idade: ");
				System.out.println("Empresa atual: " );
				System.out.println("Digite o salario atual: ");
				candidatos[i] = new Empregados(leia.next(),leia2.nextInt(),leia3.next(),leia2.nextDouble());
				i++;
				}else{
					
					System.out.println("Total de candidatos foi preenchido");
				}
					
			}else{
				
				System.out.println("Opcao invalida!");
			}
			break;
		case 2:
			System.out.println("Estagio(E) ou Contrato(C)");
			tipo_vaga = leia.next().charAt(0);
			tipo_vaga = Character.toLowerCase(tipo_vaga);
			if(tipo_vaga == 'e'){
				if(i2<vagas.length){
				System.out.println("Digite a descricao: ");
				System.out.println("Digite o salario oferecido: ");
				System.out.println("Digite o tempo de estagio: ");
				vagas[i2] = new Estagio(leia.next(),leia2.nextDouble(),leia2.nextInt(),i2);
				i2++;
				}else{
					
					System.out.println("Total de vagas preenchidas!");
				}
			}else if(tipo_vaga == 'c'){
				if(i2<vagas.length){
				System.out.println("Digite a descricao: ");
				System.out.println("Digite o salario oferecido: ");
				System.out.println("Temporario?: ");
				vagas[i2] = new Contrato(leia.next(),leia2.nextDouble(),leia2.nextBoolean(),i2);
				i2++;
				}else{
					
					System.out.println("Total de vagas preenchidas!");
				}
			}else{
				
				System.out.println("opcao invalida!");
			}
			break;
			case 3:
				System.out.println("Digite o id da vaga: ");
				int num1 = leia.nextInt();
				System.out.println("Digite o id do candidato: ");
				int num2 = leia.nextInt();
				candidatosVaga[i3] = new CandidatosVaga(vagas[num1],candidatos[num2]);
				i3++;
				break;
			case 4:
				for(int indice = 0;indice<vagas.length;indice++){
					
					if(vagas[indice]!= null){
						
						System.out.println(vagas[indice]);
					}
				}
				break;
			case 5:
				for(int indice = 0;indice<candidatos.length;indice++){
					
					if(candidatos[indice]!= null){
						
						System.out.println(candidatos[indice]);
					}
				}
				break;
			case 6:
				System.out.println("Digite a vaga que deseja visualizar: ");
				int vaga = leia.nextInt();
				for(int indice = 0;indice<candidatosVaga.length;indice++){
					if(candidatosVaga[indice] != null){
					if(candidatosVaga[indice].getId() == vaga){
						
						System.out.println(candidatosVaga[indice].getCandidatos());
					}
					}
				}
				break;
			
		}
		
		}while(opcao!=0);
		
	}
}

