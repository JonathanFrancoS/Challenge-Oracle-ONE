package conversorMoneda;

public class Divisa {
	
	String nombre;
	double valor;
	
	public Divisa(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public double cambioDivisaALocal(double monedaDivisa, double valorDeCambio, double monedaLocal) {
		
		double divisaALocal = monedaDivisa * valorDeCambio / monedaLocal;
		
		return divisaALocal;	
				
	}
	
	public double cambioLocalADivisa(double valorDeCambio, double monedaLocal, double monedaDivisa) {
		
		double localADivisa = valorDeCambio * monedaLocal / monedaDivisa;
		
		return localADivisa;
		
	}
	
	
}
