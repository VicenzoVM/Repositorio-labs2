package ui;

import java.util.Scanner;

import celular.Celular;



public class Ui {
	private Celular celular;

	public Ui() {
		this.celular = new Celular();
	}

	
	public Celular getCelular() {
		return celular;
	}


	public void setCelular(Celular celular) {
		this.celular = celular;
	}


	public void mostraUI() {
		System.out.println(
				"\n[1] Cadastrar contato \n[2] Remover contato\n[3] Cadastrar chamada nao atendida\n[4] Mostrar lista de chamadas nao atendidas\n[5] Excluir todas chamadas nao atendidas\n[6] Sair ");

	}

	public void rodarUI() {
		mostraUI();

		Scanner sc = new Scanner(System.in);
		int opcao = Integer.parseInt(sc.nextLine()); // caso eu usasse o sc.nextInt() ele pulava uma linha, mesmo caso
														// nos outros.
		while (opcao != 6)
			switch (opcao) {
			
			case 1:
				System.out.println("digite o numero do contato");
				String numero = sc.nextLine();
				System.out.println("digite o nome do contato");
				String nome = sc.nextLine();

				celular.cadastrarContato(numero, nome);
				mostraUI();
				opcao = Integer.parseInt(sc.nextLine());
				break;
				

			case 2:
				System.out.println("digite o numero do contato");
				 numero = sc.nextLine();
				System.out.println("digite o nome do contato");
				nome = sc.nextLine();
				celular.removerContato(numero, nome);
				System.out.println(celular.getContatos());
				mostraUI();
				opcao = Integer.parseInt(sc.nextLine());

				break;

			case 3:
				System.out.println("digite o numero da chamada");
				numero = sc.nextLine();
				celular.cadastraChamadaNaoAtendida(numero);
				mostraUI();
				opcao = Integer.parseInt(sc.nextLine());
				
				break;

			case 4:
				celular.mostrarChamadasNaoAtendidas();
				mostraUI();
				opcao = Integer.parseInt(sc.nextLine());
				break;

			case 5:
				celular.excluirChamadasNaoAtendidas();
				mostraUI();
				opcao = Integer.parseInt(sc.nextLine());
				break;
			
				
			}
		sc.close();
		
	

	}
	

}
