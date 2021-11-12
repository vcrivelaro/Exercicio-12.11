package Familia38;

public class TesteCliente {
	public static void main(String[] args) {
		
		// instanciando um objeto da classe Cliente
		
		Cliente cliente1 = new Cliente ("Denise Crivelaro","radiologista","chocolate", 51);
		cliente1.imprimirInfo();
		System.out.println("\n ***Troca de produto***");
		cliente1.setProduto("Bambole");
		cliente1.imprimirInfo();
		System.out.println("\n **Parabéns por mais um ano de vida!!");
		cliente1.setIdade(52);
		cliente1.imprimirInfo();
		
		
		Cliente cliente2= new Cliente ("Vitor Crivelaro","Orientador","Placa de video", 27);
		cliente2.imprimirInfo();
		System.out.println("\n ***Troca de profissão!!***");
		cliente2.setProfissao("Desenvolvedor Junior");		
		cliente2.imprimirInfo();
		System.out.println("\n***Comprou uma aliança e propôs a Nathália em casamento!!!***");
		cliente2.setProduto("Anéis");
		cliente2.imprimirInfo();
		
		Cliente cliente3= new Cliente ("Nathália Carvalho","Designer de Sobrancelha", "mascara",31);
		cliente3.imprimirInfo();
		System.out.println("\n***Nathália aceita o pedido de casamento e alterou seu nome !!! parabains !!! ***");
		cliente3.setNome("Nathália Carvalho Crivelaro");
		cliente3.imprimirInfo();
	}

}
