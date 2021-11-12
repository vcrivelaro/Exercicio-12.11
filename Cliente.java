package Familia38;

public class Cliente {
	
	// declaração de atributos de classe
	
	private String nome;	
	private String profissao;
	private String produto;
	private int idade;
	
	// declarar o método  construtor
	
	public Cliente (String nome, String profissao, String produto, int idade) // parametros ou argumentos
	{
		this.nome = nome;
		this.profissao = profissao;
		this.produto = produto;
		this.idade = idade;
	}
	
	// declaração dos demais metodos da classe (Imprimir a informação)
	
	public void imprimirInfo()
	{
		System.out.println("\n"+nome+" é "+profissao+" tem "+idade+ " anos e comprou "+produto+"!!");
	}
	
	// criação dos métodos get e set 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
