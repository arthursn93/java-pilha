public class FluxoComTratamento {
	
	public static void main(String[] args) {
		System.out.println("Entrando do main");
		try {
			metodo1();
		}catch (Exception ex) {			
			System.out.println("Exception" + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("Saindo do main");
	}
	public static void metodo1() {
		System.out.println("Entrando do metodo1");
		metodo2();
		System.out.println("Saindo do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Entrando do metodo2");
		//ArithmeticException ex = new ArithmeticException("Erro de tratamento ArithmeticException!");
		//throw ex;	
		//throw new ArithmeticException("Erro!");
		throw new NullPointerException("Erro de tratamento NullPointerException!");
		//System.out.println("Saindo do metodo2");
	}
}