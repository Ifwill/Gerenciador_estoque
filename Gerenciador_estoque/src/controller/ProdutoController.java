package controller;

import view.ProdutoView;

public class ProdutoController {
	private ProdutoView  produtoview;
	
	public ProdutoController() {
		produtoview = new ProdutoView();
	}
	
	public void start() {
		int op = 0;
		
		do {
			
			switch(produtoview.menu()) {
			
			}
			
		}while(op != 0 );
	}

}
