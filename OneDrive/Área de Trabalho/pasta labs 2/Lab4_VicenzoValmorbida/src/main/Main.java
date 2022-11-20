package main;
import vacina.*;


public class Main {
	public static void main(String[] args) {
		FilaPacientes f = new FilaPacientes();
		Vacinados v = new Vacinados();
		
		Paciente p1 = new Paciente("Marcio",22);
		Paciente p2 = new Paciente("Roberta",53);
		Paciente p3 = new Paciente ("Gerisvaldo",100);
		
		
		
		f.getPacientes().add(p1);
		f.getPacientes().add(p2);
		f.getPacientes().add(p3);
		
		
		 f.vacinarTodosPacientes(f.getPacientes(),v.getVacinados());
	
	}

}
