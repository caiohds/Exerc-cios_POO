public class Contrato extends Vagas{
	private boolean temporario;
	private int id;
	public Contrato(String descricao,double salario_oferecido,boolean temporario, int id){
		
		super(descricao,salario_oferecido,id);
		this.temporario = temporario;
		
	}
	public String toString(){
		
		return "Descricao: " + getDescricao() + "\nSalario oferecido: " + getSalario_oferecido() + "\n" +(this.temporario ? "Temporario":"tempo indeterminado");
	}
	public int getId(){
		
		return this.id;
	}
}
