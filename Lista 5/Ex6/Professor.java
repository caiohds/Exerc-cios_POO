public class Professor extends Pessoa{
	
	private String disciplina[] = new String[5];
	private double salario;
	
	public Professor(){
		
		this.salario = 0;
	}
	public Professor(String nome, int idade, double salario){
		super(nome,idade);
		this.salario = salario;
		
	}
	
	public void setDisciplina( String disciplina ) {
		for (int i = 0 ; i < this.disciplina.length ; i++ ) {
			if ( this.disciplina[i] == null ) {
				this.disciplina[i] = disciplina;
					return;
			}
		} 
	}
	public void setSalario(double salario){
		
		this.salario = salario;
	}
	public String getDisciplina(int indice){
		
		return this.disciplina[indice];
	}
	public double getSalario(){
		
		return this.salario;
	}
	public String exibirDisciplinas(){
		
		for(int i = 0; i<this.disciplina.length;i++){
		
			if(this.disciplina[i] != null){
				
				System.out.print(" "+ disciplina[i] + " ");
			}
		}
		return "";
	}
	public String toString(){
		
		return "Disciplinas: " +"Nome: " + getNome() + " idade: " + getIdade()  + " Salario: " + getSalario() +  exibirDisciplinas();
	}
}
