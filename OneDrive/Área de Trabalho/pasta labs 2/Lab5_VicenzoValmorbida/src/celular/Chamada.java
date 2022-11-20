package celular;

public class Chamada {
	String numero;

	public Chamada(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Chamada [numero=" + numero + "]";
	}
	
	
}
