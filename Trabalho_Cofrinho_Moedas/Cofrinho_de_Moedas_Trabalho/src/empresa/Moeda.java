//JULIANO KENNEDY RODRIGUES RU:4424050

package empresa;

abstract class Moeda {
	double valor; //armazena quanto dinheiro cada classe com esse atributo tem
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	public abstract double converter();
}
