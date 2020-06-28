public class FluxoComTratamento {
	
	public static void main(String[] args) {
		System.out.println("Entrando do main");
		try {
			metodo1();
		}catch (ArithmeticException | NullPointerException | MinhaException ex) {			
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
		//ArithmeticException ex = new ArithmeticException("Erro!");
		//throw ex;	
		//throw new ArithmeticException("Erro!");
		throw new MinhaException("Erro!");
		//System.out.println("Saindo do metodo2");
	}
}