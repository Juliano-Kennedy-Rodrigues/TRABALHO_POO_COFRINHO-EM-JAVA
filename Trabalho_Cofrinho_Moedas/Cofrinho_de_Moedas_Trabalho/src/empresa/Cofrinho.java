//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

import java.util.ArrayList;

public class Cofrinho {
	//cria array que armazena os objetos de tipo Moeda criados
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	//método para adicionar um valor a uma moeda. Também adiciona na array list
	public void adicionar(Moeda moeda, double valor) throws Exception {
		if(valor > 0) { //verifica se o valor a adicionar é maior que zero
			moeda.valor += valor; //soma o valor adicionado pelo usuário no atributo moeda
			listaMoedas.add(moeda);//add o objeto criado na lista
		}
		else {
			throw new Exception ("Valor inválido. Adicione mais do que zero.");	//mensagem de erro caso tentem adicionar valor <= que 0
		}

	}
	
	//classe que subtrai ou remove moedas, dependendo do valor que digite
	public void remover(Moeda moeda, double valor) throws Exception {
		if(valor > 0 && valor <= moeda.valor) { //garante que retire mais que 0 e menos do que/ou o valor total existente
			moeda.valor -= valor;
		}
		else {
			throw new Exception ("Valor inválido. Remova mais do que zero e não mais do valor disponível.");
		}
	}
	
	//método que percorre a lista e printa ela na tela
	public void listagemMoedas(Real real, Dolar dolar, Euro euro) {
		for(Moeda m : listaMoedas) {
			m.info();
		}
	}
	
	//método que soma os valores que já foram convertidos ao serem passados como atributo
	public double totalConverter(double real, double dolar, double euro) {
		return real+dolar+euro;
	}
		
	
}

