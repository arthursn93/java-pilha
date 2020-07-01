
public class TestaExceptionChecked {

	public static void main(String[] args) {
		
		ContaTeste c = new ContaTeste();
		try {
			c.deposita();
		} catch (MinhaException ex) {
			System.out.println("tratamento...");
		}
	}

}
