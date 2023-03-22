package paquetecompartido;


import java.util.Arrays;

public class Pizzitas {

	private final int MAX_INGREDIENTE = 3;	
	private Ingredientes ingredientes[];
	private TamaÃ±o size;
	private int contIng;
	
	
	public Pizza() {
		setSize(size.FAMILIAR);
		ingredientes = new Ingredientes[MAX_INGREDIENTE];
		contIng = 0;
		
		
	}
	public boolean addIngrediente(Ingredientes ingredientes) {
		boolean correcto = false;
		if(getContIng() + 1<= getMAX_INGREDIENTE()) {
			this.ingredientes[getContIng()] = ingredientes;	
		}			
		return false;
		
	}
	
	public enum TamaÃ±o {
		FAMILIAR, MEDIANA
		}

	public Ingredientes[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredientes[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public TamaÃ±o getSize() {
		return size;
	}
	
	public TamaÃ±o getSize(TamaÃ±o size) {
		return size.FAMILIAR;
	}

	public void setSize(TamaÃ±o size) {
		this.size = size;
	}
	

	public int getContIng() {
		return contIng;
	}
	public void setContIng(int contIng) {
		this.contIng = contIng;
	}
	public int getMAX_INGREDIENTE() {
		return MAX_INGREDIENTE;
	}
	@Override
	public String toString() {
		return "Pizza [ingredientes=" + Arrays.toString(ingredientes) + ", size=" + size + "]";
		
	}
	
	
	
}
