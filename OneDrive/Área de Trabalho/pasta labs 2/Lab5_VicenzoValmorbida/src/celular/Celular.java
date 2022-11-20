package celular;

import java.util.ArrayList;

public class Celular {
	private ArrayList<Chamada> chamadas;
	private ArrayList<Contato> contatos;

	public Celular() {
		this.chamadas = new ArrayList<Chamada>();
		this.contatos = new ArrayList<Contato>();

	}

	public ArrayList<Chamada> getChamadas() {
		return chamadas;

	}

	public void setChamadas(ArrayList<Chamada> chamadas) {
		this.chamadas = chamadas;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	public boolean cadastrarContato(String numero, String nome) {

		Contato c = new Contato(numero, nome);

		for (Contato contato : contatos)
			if (contato.getNumero().equals(numero)) {
				System.out.println(
						"[FALHA AO CADASTRAR CONTATO] - Ja existe um contato com esse numero, tente novamente");
				return false;

			}

		contatos.add(c);
	
		return true;

	}

	public boolean removerContato(String numero, String nome) {
		

		for (int i = 0; i < contatos.size(); i++)
				if(contatos.get(i).getNome().equals(nome) & contatos.get(i).getNumero().equals(numero)) {
					int remocao = i;
					contatos.remove(remocao);
					System.out.println("contato removido com sucesso");
					return true;
				}
				System.out.println("contato nao encontrado");	
		return false;	    
				
				
			

		

	}

	public boolean cadastraChamadaNaoAtendida(String numero) {
		Chamada cha = new Chamada(numero);
		
		if(chamadas.add(cha))
			return true;
		
		return false;
	
				
	}

	public boolean mostrarChamadasNaoAtendidas() {
		if (chamadas.isEmpty()) {
			System.out.println("A LISTA DE CHAMADAS ESTA VAZIA");
			return false;
		}
		for (Chamada c : chamadas) {
			System.out.println();
			System.out.print("CHAMADA " + c.getNumero() + " ");
			for (Contato contato : contatos)
				if (c.getNumero().equals(contato.getNumero()))
					System.out.print("DO CONTATO " + contato.getNome());

			System.out.println();

		}
		return true;

	}

	public void excluirChamadasNaoAtendidas() {
		chamadas.clear();
		System.out.println("A LISTA DE CHAMADAS FOI ESVAZIADA");
	}

}
