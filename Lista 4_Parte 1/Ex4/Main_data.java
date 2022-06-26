public class  Main_data{
	
	public static void main (String[] args) {
		Data d1 = new Data(19,9,2002);
		
		System.out.println(d1.mostrarData());
		System.out.println((d1.validarData() ? "A data e valida":"A data nao e valida"));
	}
}

