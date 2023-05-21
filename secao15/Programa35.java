package br.com.geekuniversity.secao15;
//Métodos Estáticos 

/*
 Um método estático não depende de uma intância da classe para ser utilizado.
 Não depende de uma instância da classe para usar esse método.
 
 
 Pode-se utilizar conforme:
 
 NomeDaClasse.metodo();
 
 */
public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");
		System.out.println("Número da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		
		System.out.println("A próxima conta será: " + Conta.proximaConta());

	}

}
