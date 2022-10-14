package futbol;

public abstract class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private String posicion;
	
	protected Futbolista(String nombre, int edad, String posicion) {}
	
	protected Futbolista() {
		this.nombre = "Maradona";
		this.edad = 30;
		this.posicion = "Delantero";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String toString() {
		return "El futbolista " +nombre+
				" tiene " +edad+
				" y juega de " +posicion;
	}
	
	public boolean equals(Futbolista f) {
		if (this.nombre == f.getNombre() &&
				this.edad == f.getEdad() &&
				this.posicion == f.getPosicion()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract boolean jugarConLasManos();
}