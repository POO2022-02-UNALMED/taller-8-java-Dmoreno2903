package futbol;

public class Main {

	public static void main(String[] args) {
		Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		
		System.out.println("El futbolista Santiago tiene 23, y juega de Portero con el dorsal 8. Le han marcado 6");
		System.out.println(f.toString());

	}

}
