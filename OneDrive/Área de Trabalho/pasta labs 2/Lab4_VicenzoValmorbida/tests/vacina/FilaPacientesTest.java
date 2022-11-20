package vacina;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaPacientesTest {

	@Test
	void vacinarTodosPacientesTest () {
		
		FilaPacientes f = new FilaPacientes();
		Vacinados v = new Vacinados();
		
		Paciente p1 = new Paciente("Marcio",22);
		Paciente p2 = new Paciente("Roberta",53);
		Paciente p3 = new Paciente ("Gerisvaldo",100);
		
		
		
		f.getPacientes().add(p1);
		f.getPacientes().add(p2);
		f.getPacientes().add(p3);
		
		
		assertTrue( f.vacinarTodosPacientes(f.getPacientes(),v.getVacinados()));
	}

}
