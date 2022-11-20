package celular;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CelularTest {
	Celular c;
	@Before
	void setup() {
		c = new Celular();
	}
	
	@Test
	void cadastrarContatoTest() {
		setup();
		assertTrue(c.cadastrarContato("123456789", "Vicenzo"));
		
	}
	@Test
	void removerContatosTest() {
		setup();
		c.cadastrarContato("123456789", "Vicenzo");
		assertTrue(c.removerContato("123456789", "Vicenzo"));
		assertFalse(c.removerContato("12304599","Pedro" ));
			
	}
	@Test
	void cadastraChamadaNaoAtendidaTest() {
		setup();
		assertTrue(c.cadastraChamadaNaoAtendida("12321312"));
		

		
	}
	@Test
	void mostrarChamadasNaoAtendidasTest() {
		setup();
		c.cadastraChamadaNaoAtendida("teste");
		assertTrue(c.mostrarChamadasNaoAtendidas());
		c.excluirChamadasNaoAtendidas();
		assertFalse(c.mostrarChamadasNaoAtendidas());
		
	}
	
	

}
