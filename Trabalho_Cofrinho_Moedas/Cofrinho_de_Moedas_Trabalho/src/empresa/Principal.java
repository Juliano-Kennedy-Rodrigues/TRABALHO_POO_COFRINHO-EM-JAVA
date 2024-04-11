//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//instancio meus objetos para poder acessar 
		Cofrinho c1 = new Cofrinho();
		//os objetos filhos da classe abstrata foram instânciados com valor 0 devido ao construtor
		Real r1 = new Real(0);
		Dolar d1 = new Dolar(0);
		Euro e1 = new Euro(0);
		
		//cria objeto que permite o usuário digitar as infos
		Scanner teclado = new Scanner(System.in);
		System.out.println("\r\n"
				+ "COFRINHO:\r\n"
				+ "1 - ADICIONAR MOEDA\r\n"
				+ "2 - REMOVER MOEDA\r\n"
				+ "3 - LISTAR MOEDAS\r\n"
				+ "4 - SOMAR E CONVERTER PARA REAL\r\n"
				+ "5 - SAIR");
		int pergunta = teclado.nextInt(); //salva o que o user digitou
		
		int qualMoeda; //para controle de escolhas
		double valor = 0; //para salvar o valor das moedas adicionadas
		
		//laço de repetição, para que as perguntas sejam repetidas até que não precise mais (escolha)
		while(pergunta != 5) {
			switch (pergunta) { 
			
			case 1: { //caso tenha digitado um para a pergunta 
				qualMoeda = 0; //gantae que o valor da var de controle seja 0, para não ter erro
				while(qualMoeda >3 || qualMoeda < 1) { //se estiver no escopo de escolhas para a pergunta
					System.out.println(""
							+ "1 - REAL\r\n"
							+ "2 - DOLAR\r\n"
							+ "3 - EURO");
					qualMoeda = teclado.nextInt();
				}
				try { //para tratar a Exception lançada pelo método adicionar
					if(qualMoeda == 1) {
						System.out.println("Qantos reais quer colocar no cofrinho?");
						valor = teclado.nextDouble();
						c1.adicionar(r1, valor); //passa qual Moeda (Real) e qual valor
						r1.info(); 
					}
					else if(qualMoeda == 2) {
						System.out.println("Qantos dólares quer colocar no cofrinho?");
						valor = teclado.nextDouble();
						c1.adicionar(d1, valor);
						d1.info();
					}
					else {
						System.out.println("Qantos euros quer colocar no cofrinho?");
						valor = teclado.nextDouble();
						c1.adicionar(e1, valor);
						e1.info();
					}
				}
				catch(Exception e) { //tratando o Exception lançada pelo método
					System.out.println(e.getLocalizedMessage()); //mostra o valor que gerou o erro
				}
	
				break; //força saida desse pedaço
			}	
			
			//caso 2 é o de remoção
			case 2: {
				qualMoeda = 0;
				while(qualMoeda >3 || qualMoeda < 1) {
					System.out.println(""
							+ "1 - REAL\r\n"
							+ "2 - DOLAR\r\n"
							+ "3 - EURO");
					qualMoeda = teclado.nextInt();
				}
				try {
					if(qualMoeda == 1) {
						System.out.println("Qantos reais quer remover do cofrinho?");
						valor = teclado.nextDouble();
						c1.remover(r1, valor);
						r1.info();
					}
					else if(qualMoeda == 2) {
						System.out.println("Qantos dólares quer remover do cofrinho?");
						valor = teclado.nextDouble();
						c1.remover(d1, valor);
						d1.info();
					}
					else {
						System.out.println("Qantos euros quer remover do cofrinho?");
						valor = teclado.nextDouble();
						c1.remover(e1, valor);;
						e1.info();
					}
					break;
				}
				catch(Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
				
				
				break;
			}
			
			//caso 3 printa a lista em que é armazenada os objetos (Mpedas)
			case 3: {
				c1.listagemMoedas(r1, d1, e1); //passa os objetos como atributos, como requerido pelo método
				break;
			}
			
			//caso 4 mostra a soma dos valores convertidos em reais
			case 4: {
				//como o método só soma os atributos, já são lançados convertidos, usando o método da sua classe
				System.out.println("Dinheiro total no cofrinho, convertido para reais e somado: " 
				+c1.totalConverter(r1.converter(), d1.converter(), e1.converter()));
				break;
			}
			
			default:
				throw new IllegalArgumentException("Ação inválida. escolha umas das cinco ações listadas");
				
			}
			
			System.out.println("\r\n"
					+ "COFRINHO:\r\n"
					+ "1 - ADICIONAR MOEDA\r\n"
					+ "2 - REMOVER MOEDA\r\n"
					+ "3 - LISTAR MOEDAS\r\n"
					+ "4 - SOMAR E CONVERTER PARA REAL\r\n"
					+ "5 - SAIR");
			pergunta = teclado.nextInt();

		}//fim do while geral
		
		System.out.println("Encerrando programa.");
		
		
	}
}
