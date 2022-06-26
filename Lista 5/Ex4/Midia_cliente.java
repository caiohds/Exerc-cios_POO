public class Midia_cliente{
	
	private Midia midia;
	private Cliente cliente;
	
	public Midia_cliente(Cliente cliente,Midia midia){
		this.midia = midia;
		this.cliente = cliente;
		
	}
	public double getValorMidia(){
		
		return midia.getValor();
	}
	public int getCodigoCliente(){
		
		return cliente.getCodigo();
	}
	public String toString(){
		
		return "-------------------Cliente------------------" + "\n" + this.cliente +"\n-------------------------------midia------------------\n" + this.midia;
	}
}

