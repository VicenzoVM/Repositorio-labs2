package comparators;

import java.util.Comparator;

import eleicao.Candidato;

public class NumeroDeVotos implements Comparator<Candidato> {

	@Override
	public int compare(Candidato candidato1, Candidato candidato2) {
		 return Double.compare(candidato1.getNumero_de_votos(), candidato2.getNumero_de_votos());
		
	}

}
