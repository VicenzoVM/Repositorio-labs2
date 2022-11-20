package eleicao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EleicaoTest {
	Eleicao e;
	@Test
	void setup() {
		e = new Eleicao();
	}
	@Test
	void adicionarCandidatoTest() {
		setup();
		assertTrue(e.adicionarCandidato("candidato", "partido generico", 40, 1000));
	}
	
	@Test
	void candidatoMaisJovemTest() {
		setup();
		e.adicionarCandidato("candidato", "partido generico", 40, 1000);
		e.adicionarCandidato("candidato", "partido generico", 70, 1000);
		assertTrue(e.candidatoMaisJovem());
	}
	
	@Test
	void candidatoMaisVelhoTest() {
		setup();
		e.adicionarCandidato("candidato", "partido generico", 40, 1000);
		e.adicionarCandidato("candidato", "partido generico", 70, 1000);
		assertTrue(e.candidatoMaisVelho());
	}
	
	@Test
	void candidatoMaisVotadoTest() {
		setup();
		e.adicionarCandidato("candidato", "partido generico", 40, 1000);
		e.adicionarCandidato("candidato", "partido generico", 70, 1000);
		assertTrue(e.candidatoMaisVotado());
		
	}
	
	@Test
	void candidatoMenosVotadoTest() {
		setup();
		e.adicionarCandidato("candidato", "partido generico", 40, 1000);
		e.adicionarCandidato("candidato", "partido generico", 70, 1000);
		assertTrue(e.candidatoMenosVotado());
	}
	
	@Test
	void  totalDeVotosTest() {
		setup();
		e.adicionarCandidato("candidato", "partido generico", 40, 1000);
		e.adicionarCandidato("candidato", "partido generico", 70, 1000);
		assertEquals(2000,e.totalDeVotos() );
	}
}
