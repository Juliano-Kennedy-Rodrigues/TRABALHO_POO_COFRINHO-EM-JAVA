//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

public class Real extends Moeda{	
	public Real(double valor) {
		super(valor);		
	}
	
	//classe que printa as informações
	@Override
	public void info() {
		System.out.println("Real: " +valor);
	}

	//real não precisa nem pode ser convertido para real, então só retorna o valor na íntegra
	@Override
	public double converter() {
		return valor;
	}

}
