package br.com.geekuniversity.secao15;
//M�todos Est�ticos 

/*
 Um m�todo est�tico n�o depende de uma int�ncia da classe para ser utilizado.
 N�o depende de uma inst�ncia da classe para usar esse m�todo.
 
 
 Pode-se utilizar conforme:
 
 NomeDaClasse.metodo();
 
 */
public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");
		System.out.println("N�mero da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		
		System.out.println("A pr�xima conta ser�: " + Conta.proximaConta());

	}

}
