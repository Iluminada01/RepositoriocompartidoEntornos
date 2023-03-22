package paquetecompartido;

public class Ingredientes {

	private String nombreIngrediente;
	private Double caloria;
	
	public Ingredientes() {
		setNombreIngrediente("Queso");
		setCaloria(200.0);
	}
		
	public String getNombreIngrediente() {
		return nombreIngrediente;
	}
	
	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}
	
	public Double getCaloria() {
		return caloria;
	}
	
	public void setCaloria(Double caloria) {
		this.caloria = caloria;
	}
	
	@Override
	public String toString() {
		return "Ingredientes [nombreIngrediente=" + nombreIngrediente + ", caloria=" + caloria + "]";
	}
	
}

