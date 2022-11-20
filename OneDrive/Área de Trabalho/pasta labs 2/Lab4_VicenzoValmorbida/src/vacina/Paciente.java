package vacina;

public class Paciente implements Comparable <Paciente>  {
	
	private String nome;
	private int idade;
	
	public int compareTo(Paciente o) {
        return o.idade > this.idade ? 1 : -1;
	}
	public Paciente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
