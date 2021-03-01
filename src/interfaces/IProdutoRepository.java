package interfaces;

import entities.Produto;

public interface IProdutoRepository {
	
	public static final String PATH = "c:\\temp\\";
	
	void exportarDados(Produto produto) throws Exception;

}
