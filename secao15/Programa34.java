package br.com.geekuniversity.secao15;
//Atributos Estáticos

/*
 - Atributos estáticos são atributos, onde os valores são compartilhado
 entre as instâncias da classe.
 
 - Para utilizar um atributo estático, colocamos o nome da classe junto ao atributo
 
 ex: NomeDaClasse.atributo;
 */
public class Programa34 {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Luana Carla\n");		
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Jorge Ferreira\n");		
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Claudio Costa\n");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
		System.out.println(Conta.contador);
		
		Conta.contador = 42;
		
		System.out.println(Conta.contador + "\n");
		
		Conta c4 = new Conta("Claudio Fonseca\n");
		System.out.println(c4.getNumero());
		System.out.println(c4.getCliente());

	}

}
