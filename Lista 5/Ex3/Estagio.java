public class Estagio extends Vagas{
	private int tempo;
	private int id;
	
	public Estagio(String descricao,double salario_oferecido,int tempo, int id){
		
		super(descricao,salario_oferecido,id);
		this.tempo = tempo;
		
	}
	public String toString(){
		
		return "Descricao: " + getDescricao() + "\nSalario oferecido: " + getSalario_oferecido() + "\nTempo de estagio: " + this.tempo;
	}
	public int getId(){
		
		return this.id;
	}
}
