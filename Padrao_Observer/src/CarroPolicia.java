import java.util.*;

public class CarroPolicia implements Observer, Carro{

	@Override
	public void frente() {
		// TODO Auto-generated method stub
		
		System.out.println("Viatura segue em frente !! ");
		
	}

	@Override
	public void direita() {
		// TODO Auto-generated method stub
		
		System.out.println("Viatura vira a direita !! ");
		
	}

	@Override
	public void esquerda() {
		// TODO Auto-generated method stub
		
		System.out.println("Viatura vira a esquerda !! ");
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
		System.out.println("Viatura para !! ");
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		CarroRoubado carroObservado = (CarroRoubado)arg0;
		String acao = String.valueOf(arg1);
		
		if(acao.equals("frente")) {
			this.frente();
			
		}else {
			if(acao.equals("direita")) {
				this.direita();
				
			}else {
				if (acao.equals("esquerda")) {
					this.esquerda();
					
				}else {
					if(acao.equals("parar")) {
						this.parar();
						
					}
				}
			}
		}
		
		
	}

}
