package entities;

import enums.Categoria;
import enums.Status;

public class Produto {
	
	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Categoria categoria;
	private Status status;
	
	//--------------------------------------------------------------------------------------------------//
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade, Categoria categoria,
			Status status) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
		this.status = status;
	}

	//--------------------------------------------------------------------------------------------------//
	
	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	//--------------------------------------------------------------------------------------------------//
	
	 @Override
	public String toString() {
		return "Produto -> idProduto: " + this.idProduto + "nome: " + this.nome + "preco: " + this.preco + "quantidade: " + this.quantidade + "categoria: " + this.categoria + "status: " + this.status;		
	}
	 
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Produto) {
			Produto produto = (Produto) obj;
			return this.idProduto.equals(produto.getIdProduto());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.idProduto.hashCode();
	}
}
