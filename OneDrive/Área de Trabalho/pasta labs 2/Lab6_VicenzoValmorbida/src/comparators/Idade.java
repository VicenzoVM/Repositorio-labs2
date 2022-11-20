package comparators;


import java.util.Comparator;

import eleicao.Candidato;

public class Idade implements Comparator <Candidato> {
	
	@Override
	public int compare(Candidato candidato, Candidato candidato2) {
		 return Integer.compare(candidato.getIdade(), candidato2.getIdade());
		
	}

	

}
