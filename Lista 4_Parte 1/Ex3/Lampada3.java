public class Lampada3{
	

		private char estado;
		public Lampada3(){
			
			estado = 'a';
		}
		public void setEstado(char estado){
			
			this.estado = estado;
		}
		public char getEstado(){
			
			return estado;
		}
		public String toString(){
			
			if(estado == 'a'){
				
				return "Acesa";
			}else if( estado == 'd'){
				
				return "Apagada";
			}else{
				
				return "Meia-luz";
			}
			
		}
}

