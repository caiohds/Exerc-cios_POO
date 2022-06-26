public class Livro extends Midia{
	private String autor;
	private String editora;
	private int edicao;
	
	public Livro(int codigo,String titulo, String tipo, String genero, double valor,String autor,String editora, int edicao){
		
		super(codigo,titulo,tipo,genero,valor);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}
	public String toString(){
		
		return getCodigo() + "- " + "Titulo: " + getTitulo() + "Tipo: " + getTipo() + "Genero: " + getGenero() + "Valor: " + getValor() + "Autor " + this.autor + "Editora: " + this.editora + "Edicao: " + this.edicao;
	}
}
