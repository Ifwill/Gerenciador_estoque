package view;

import java.util.Scanner;

public class ProdutoView {
	private Scanner scanner;

	public ProdutoView() {
		scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("=====  menu  =====");
		System.out.println("= 1.             =");
		System.out.println("= 2.             =");
		System.out.println("= 3.             =");
		System.out.println("= 4.             =");
		System.out.println("==================");
		return scanner.nextInt();
	}
}
