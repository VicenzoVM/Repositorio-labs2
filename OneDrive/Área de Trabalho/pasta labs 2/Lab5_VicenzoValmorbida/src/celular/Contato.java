package celular;

public class Contato {
	
	@Override
	public String toString() {
		return "Contato [numero=" + numero + ", nome=" + nome + "]";
	}

	private String numero;
	private String nome;
	
	public Contato(String numero,String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	public Contato(String numero) {
		this.numero = numero;
		
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
