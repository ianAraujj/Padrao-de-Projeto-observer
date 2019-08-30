
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarroRoubado r = new CarroRoubado();
		CarroPolicia p = new CarroPolicia();
		
		
		// O observador precisa conhecer o objeto observado
		r.addObserver(p);
		
		r.frente();

	}

}
