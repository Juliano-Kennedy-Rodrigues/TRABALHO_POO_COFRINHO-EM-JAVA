//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

public class Euro extends Moeda{

	//construtor que pega atributo que guarda o dinheiro da classe mãe
	public Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	//classe que printa as informações
	@Override
	public void info() {
		System.out.println("Euro: " +valor);
	}
	
	//classe que converte dólar pra reais com a conversão atual 
	@Override
	public double converter() {
		//euro dia 23/03/24 --. 5,43
		return this.valor * 5.43;
	}

}
