public class Conta{
		private int quantidade_pessoas;
		private double valor_total;
		private boolean garcom;
		public void setQuantidade_pessoas(int quantidade){

			this.quantidade_pessoas = quantidade;
		}
		public int getQuantidade_pessoas(){
			
			return quantidade_pessoas;
		}
		public void setValor_total(double valor){
			
			this.valor_total = valor;
		}
		public double getValor_total(){
			
			return valor_total;
		}
		public void setGarcom(boolean garcom){
			
			this.garcom = garcom;
		}
		public boolean hasGarcom(){
			
			return garcom;
		}
		public String toString(){
			
			return "Valor total da conta: " + getValor_total() 
			+ "\nQuantidade de Pessoas: " + getQuantidade_pessoas()
			+"\nGorjeta do Garcom?" + (hasGarcom() ? getValor_total() * 0.10: 0)
			+"\nQuantidade por pessoa: " + (getValor_total()/getQuantidade_pessoas());
		}
}

