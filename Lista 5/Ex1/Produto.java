public class Produto{
		private double quantidade;
		private double preco;
		public Produto(double quantidade, double preco){
				
			this.quantidade = quantidade;
			this.preco = preco;
		}
		public double getQuantidade(){
			
			return this.quantidade;
		}
		public double getPreco(){
			
			return this.preco;
		}
		public double valor_final(){
			
			return (this.quantidade * this.preco);
		}
	
}

