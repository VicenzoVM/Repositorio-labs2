package main;

import ui.Ui;

public class Main {
	public static void main(String[] args) {
		Ui userinterface = new Ui();
		userinterface.rodarUI();
		
		System.out.println(userinterface.getCelular().getContatos());
		

	}
}
