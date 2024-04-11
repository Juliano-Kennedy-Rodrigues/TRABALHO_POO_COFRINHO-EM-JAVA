//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

public class Dolar extends Moeda{
	
	public Dolar(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	//classe que printa as informações
	@Override
	public void info() {
		System.out.println("Dólar: " +valor);
	}

	//classe que converte dólar pra reais com a conversão atual 
	@Override
	public double converter() {
		//dolar dia 23/03/2024 --> 5,00
		return valor*5;		
	}
}
