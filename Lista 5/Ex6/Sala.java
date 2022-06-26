public class Sala{
	private String nome;
	private Pessoa pessoa[];
	public Sala(){
		
		this.nome = "nenhum";
		this.pessoa = null;
	}
	public Sala(int qt_pessoas){
		
		this.pessoa = new Pessoa[qt_pessoas];
	}
	public void setNome(String nome){
		
		this.nome = nome;
	}
	public String getNome(){
		
		return this.nome;
	}
	public String toString(){
		
		return "Nome da sala: " + getNome() + "Quantidade de pessoas: " + this.pessoa.length;
	}
}
