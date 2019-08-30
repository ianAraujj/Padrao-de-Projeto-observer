import java.util.*;

public class CarroRoubado extends Observable implements Carro{
	
	private String acao = "";

	@Override
	public void frente() {
		// TODO Auto-generated method stub
		acao = "frente";
		System.out.println("Carro roubado segue em frente !!! ");
		this.mudaEstado();
	}

	@Override
	public void direita() {
		// TODO Auto-generated method stub
		acao = "direita";
		System.out.println("Carro roubado vira a direita !!! ");
		this.mudaEstado();
		
	}

	@Override
	public void esquerda() {
		// TODO Auto-generated method stub
		acao = "esquerda";
		System.out.println("Carro roubado vira a esquerda !!! ");
		this.mudaEstado();
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		acao = "parar";
		System.out.println("Carro roubado parou !!! ");
		this.mudaEstado();
		
	}
	
	
	
	public void mudaEstado() {
		this.setChanged();
		this.notifyObservers(this.acao);
		
	}

}
