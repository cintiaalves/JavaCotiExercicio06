package repositories;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepositoryXML implements IProdutoRepository {

	@Override
	public void exportarDados(Produto produto) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		Element root = document.createElement("PRODUTO");
		document.appendChild(root);
		
		
		
		Element idProduto = document.createElement("IDPRODUTO");
		idProduto.setTextContent(produto.getIdProduto().toString());
		root.appendChild(idProduto);
		
		Element nome = document.createElement("NOME");
		nome.setTextContent(produto.getNome());
		root.appendChild(nome);
		
		Element preco = document.createElement("PRECO");
		preco.setTextContent(produto.getPreco().toString());
		root.appendChild(preco);
		
		Element quantidade = document.createElement("QUANTIDADE");
		quantidade.setTextContent(produto.getQuantidade().toString());
		root.appendChild(idProduto);
		
		Element categoria = document.createElement("CATEGORIA");
		categoria.setTextContent(produto.getCategoria().toString());
		root.appendChild(categoria);
		
		Element status = document.createElement("STATUS");
		status.setTextContent(produto.getStatus().toString());
		root.appendChild(status);
		
		
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource domSource = new DOMSource(document);
		StreamResult stream = new StreamResult(new File(PATH + "produto.xml"));
		transformer.transform(domSource, stream);
		
	}
}
