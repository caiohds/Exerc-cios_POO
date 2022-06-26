public class Doces extends Produto{
	public Doces(double quantidade, double preco){
		
		super(quantidade,preco);
	}
	public String toString(){
		
		return "Preco: " + getPreco() + "\nQuantidade: " + getQuantidade();
	}
}

