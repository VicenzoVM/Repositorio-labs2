package ui;

import java.util.Scanner;

import eleicao.Eleicao;

public class Ui {
	private Eleicao eleicao;

	public Ui() {
		this.eleicao = new Eleicao();
	}
	
	public Eleicao getEleicao() {
		return eleicao;
	}

	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	
		
	
	
	private void imprimirMenu() {
		System.out.println("******************************************************************************************************************************************");
		System.out.println(
				"digite [1] para ver o candidato mais jovem\ndigite [2] para ver o candidato mais velho\ndigite [3] parar ver o candidato mais votado\ndigite [4] para "
				+ "ver o candidato menos votado\ndigite [5] para ver o total de votos\ndigite [6] para ver a porcentagem de votos por candidato\ndigite [7] para sair");
		
		System.out.println("******************************************************************************************************************************************");
	}

	public void Userinterface() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("digite quantos candidatos voce quer criar");
			
			int quant = Integer.parseInt(sc.nextLine()); 
			for(int i = 0; i < quant; i++) {
				System.out.println("digite o nome do candidato");
				String nome = sc.nextLine(); 
				System.out.println("digite o partido do candidato");
				String partido = sc.nextLine(); 
				System.out.println("digite a idade do candidato");
				int idade = Integer.parseInt(sc.nextLine());
				System.out.println("digite o numero de votos do candidato");
				int nvotos = Integer.parseInt(sc.nextLine());
				eleicao.adicionarCandidato(nome, partido, idade, nvotos);
			}
	
			
			
			
			imprimirMenu();
			int opcao;
			 opcao = Integer.parseInt(sc.nextLine()); 
			
			while (opcao != 7)
				switch (opcao) { 
				
					
				case 1:
					eleicao.candidatoMaisJovem();
					imprimirMenu();
					
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
					
				case 2: 
					eleicao.candidatoMaisVelho();
					imprimirMenu();
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
					
				case 3:
					eleicao.candidatoMaisVotado();
					imprimirMenu();
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
					
				case 4: 
					eleicao.candidatoMenosVotado();
					imprimirMenu();
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
					
				case 5:
					System.out.println();
					System.out.println("O total de votos e de: " + eleicao.totalDeVotos() + "votos");
					System.out.println();
					imprimirMenu();
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
					
				case 6:
					eleicao.porcentagemDeVotos();
					imprimirMenu();
					opcao = Integer.parseInt(sc.nextLine()); 
					break;
				
			}
			sc.close();
	}	
}
