package repositories;

import java.io.FileWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepositoryJSON implements IProdutoRepository {

	@Override
	public void exportarDados(Produto produto) throws Exception {
		HashMap<String, Object> mapa = new HashMap<String, Object>();
		
		mapa.put("idProduto: ", produto.getIdProduto());
		mapa.put("nome", produto.getNome());
		mapa.put("preco", produto.getPreco());
		mapa.put("quantidade", produto.getQuantidade());
		mapa.put("categoria", produto.getCategoria());
		mapa.put("status", produto.getStatus());
		
		JSONObject json = new JSONObject(mapa);
		
		FileWriter writer = new FileWriter(PATH + "produto.json");
		writer.write(json.toJSONString());
		writer.flush();
		writer.close();
		
	}
	

}
