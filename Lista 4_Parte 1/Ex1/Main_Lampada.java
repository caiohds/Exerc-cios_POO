public class Main_Lampada{
	
	public static void main (String[] args) {
		Lampada l1 = new Lampada();
		l1.setMarca("marcax");
		l1.setModelo("modeloA");
		l1.setTipo("led");
		l1.setEstado(true);
		System.out.println(l1.toString());
	}
}

