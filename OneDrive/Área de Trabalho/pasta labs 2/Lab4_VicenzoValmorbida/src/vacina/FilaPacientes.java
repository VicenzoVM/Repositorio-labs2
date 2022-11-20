package vacina;
import java.util.*;

public class FilaPacientes {
	private Queue <Paciente> pacientes;

	public FilaPacientes() {
		
		this.pacientes = new PriorityQueue<>();
	}

	public boolean vacinarTodosPacientes(Queue <Paciente> pacientes, ArrayList<Paciente> vacinados) {
		int quantidadePacientes = pacientes.size();
		int quantidadeVacinados = vacinados.size();
		while (!pacientes.isEmpty()) {
			Paciente vacinado = pacientes.poll() ;
			
			
			vacinados.add(vacinado);
			
		
			
		}
		if (vacinados.size() == quantidadePacientes + quantidadeVacinados  )
			return true;
		
		return false;
	}
	
	public Queue<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Queue<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	
	
	

}

