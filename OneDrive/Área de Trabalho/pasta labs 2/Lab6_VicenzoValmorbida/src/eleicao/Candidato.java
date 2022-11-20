package eleicao;
//eleição: nome do candidato, partido político, idade, número de votos

public class Candidato {
	private String nome;
	private String partido;
	private int idade;
	private double numero_de_votos;

	public Candidato(String nome, String partido, int idade, double numero_de_votos) {
		this.nome = nome;
		this.partido = partido;
		this.idade = idade;
		this.numero_de_votos = numero_de_votos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;  
	}

	public double getNumero_de_votos() {
		return numero_de_votos;
	}

	public void setNumero_de_votos(double numero_de_votos) {
		this.numero_de_votos = numero_de_votos;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", partido=" + partido + ", idade=" + idade + ", numero_de_votos="
				+ numero_de_votos + "]";
	}

}
