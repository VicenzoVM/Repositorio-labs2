package eleicao;

import java.util.ArrayList;
import java.util.Collections;

import comparators.*;

public class Eleicao {
	private ArrayList<Candidato> candidatos;

	public Eleicao() {
		this.candidatos = new ArrayList<Candidato>();
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public boolean adicionarCandidato(String nome, String partido, int idade, double numero_de_votos) {
		Candidato c = new Candidato(nome,partido,idade,numero_de_votos);
		//return candidatos.add(c);
		candidatos.add(c);
		System.out.println(candidatos);
		return true;
	}

	public void OrganizarLista(int e) {
		switch (e) {

		case 1:
			NumeroDeVotos nvotos = new NumeroDeVotos();
			Collections.sort(candidatos, nvotos);

			break;

		case 2:
			Idade idade = new Idade();
			Collections.sort(candidatos, idade);

			break;
		}

	}

	public boolean candidatoMaisJovem() {
		OrganizarLista(2);
		if (candidatos.get(0) != null) {
			System.out.println();
			System.out.println(candidatos.get(0));
			System.out.println();
			return true;
		}
		
		return false;
	}

	public boolean candidatoMaisVelho() {
		OrganizarLista(2);
		if (candidatos.get(candidatos.size() - 1) != null) {
			System.out.println();
			System.out.println(candidatos.get(candidatos.size() - 1));
			System.out.println();
			return true;
		}
		
		return false;
	}

	public boolean candidatoMaisVotado() {
		OrganizarLista(1);
		//if (candidatos.get(candidatos.size() - 1) != null) {
		if (candidatos!= null) {
			System.out.println();
			System.out.println(candidatos.get(candidatos.size() - 1));
			System.out.println();
			return true;
		}
		
		return false;

	}

	public boolean candidatoMenosVotado() {
		OrganizarLista(1);
		if (candidatos.get(0) != null) {
			System.out.println();
			System.out.println(candidatos.get(0));
			System.out.println();
			return true;
		}
	
		return false;

	}

	public int totalDeVotos() {
		int votosTotais = 0;
		if (candidatos == null)
			return -1;
		for (Candidato c : candidatos)
			votosTotais += c.getNumero_de_votos();

		return votosTotais;

	}
	public void porcentagemDeVotos() {
		for(Candidato c: candidatos ) {
			double porcentagem =(c.getNumero_de_votos() * 100) / totalDeVotos() ;
			System.out.println();
			System.out.print(c.getNome() + ":");
			System.out.printf("%.3f", porcentagem);
			System.out.println();
		}
	}
}
