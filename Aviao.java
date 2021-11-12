package Familia38;

public class Aviao {
	
	// declara��o de atributos de classe
	
	private String modelo;
	private String cor;
	private int capacidadePessoas;
	private int peso;
	private int numeroPortas;
	private int numeroRodas;
	private int quantidadeTurbinas;
	
	// declarar o m�todo construtor
	
	public Aviao (String modelo, String cor, int capacidadePessoas, int peso, int numeroPortas, int numeroRodas, int quantidadeTurbinas)
	{
		this.modelo = modelo;
		this.cor = cor;
		this.capacidadePessoas = capacidadePessoas;
		this.peso = peso;
		this.numeroPortas = numeroPortas;
		this.numeroRodas = numeroRodas;
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
	
	// declara��o aos demais metodos da classe (Imprimir a informa��o)
	
	 public void imprimirInfo()
	{
		System.out.println("\nModelo: "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Capacidade de pessoas: "+capacidadePessoas);
		System.out.println("Peso do Avi�o: "+peso+ " Kg");
		System.out.println("N�mero de portas: "+numeroPortas);
		System.out.println("N�mero de rodas: "+numeroRodas);
		System.out.println("Quantidade de turbinas: "+quantidadeTurbinas);
	}
	 
	 //cria��o dos m�todos get e set

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

	 
	 
}
