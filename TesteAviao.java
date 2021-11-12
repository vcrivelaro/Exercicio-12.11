package Familia38;

public class TesteAviao {
	public static void main(String[] args) {
		
		// instaciando o objeto da classe Aviao
		
		Aviao aviao1 = new Aviao ("Bonanza G36", "Preto e branco",6,1175,6,3,0);
		aviao1.imprimirInfo();
		System.out.println("\n *** Cor alterada!! ***");
		aviao1.setCor("Azul escuro");
		aviao1.imprimirInfo();
		
		Aviao aviao2 = new Aviao ("Hawker 850XP", "Branco e vermelho",10,7407,2,3,2);
		aviao2.imprimirInfo();
		System.out.println("\n *** Foi adicionado alguns itens dentro do Avião e foi alterado o peso. ***");
		aviao2.setPeso(1475);
		aviao2.imprimirInfo();
		
		
		
	}

}
