package principal;

import java.util.Scanner;

import entities.Produto;
import enums.Categoria;
import enums.Status;
import interfaces.IProdutoRepository;
import repositories.ProdutoRepositoryJSON;
import repositories.ProdutoRepositoryXML;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Produto produto = new Produto(1, "Blusa", 20.0, 100, Categoria.Vestuario, Status.Disponivel);
			
			System.out.println("Informe o tipo de arquivo: (1)XML ou (2)JSON: ");
			Integer opcao = Integer.parseInt(new Scanner(System.in).nextLine());
			
			IProdutoRepository produtoRepository = null;
			
			switch (opcao) {
			case 1:
				produtoRepository = new ProdutoRepositoryXML();
				break;
			case 2:
				produtoRepository = new ProdutoRepositoryJSON();
				break;
			default:
				throw new Exception("Opção inválida!");
			}
			
			produtoRepository.exportarDados(produto);
			
			
			System.out.println("\nDados gravados com sucesso!");
		}
		
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}

	}

}
