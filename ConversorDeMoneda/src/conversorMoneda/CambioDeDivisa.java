package conversorMoneda;

import javax.swing.JOptionPane;

public class CambioDeDivisa {
	
	
	
		Divisa dolar = new Divisa(" Dolares",4489.05);
		Divisa euro  = new Divisa(" Euros",4926.96);
		Divisa libraEsterlina = new Divisa(" Libras Esterlinas",5579.57);
		Divisa yenJapones = new Divisa(" Yenes Japoneses",33.48);
		Divisa wonSurCoreano = new Divisa(" Wones surcoreanos",3.41);
		Divisa pesos = new Divisa(" Pesos",1);
		
		
		public void ConvertirMonedas(double valorDeCambio) {	
		
		String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ", "Conversor de moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólar","De Dólar a Pesos","De Pesos a Euros","De Euros a Pesos","De Pesos a Libras Esterlinas","De Libras Esterlinas a Pesos","De Pesos a Yen Japones","De Yen Japones a Pesos","De Pesos a Won Sur Coreano","De Won Sur Coreano a Pesos"},"Seleccion")).toString();
	

		switch(opciones) {
		
		    case "De Dólar a Pesos":
		    		double cambioDolarAPesos = dolar.cambioDivisaALocal(dolar.valor, valorDeCambio, pesos.valor);
		    		JOptionPane.showMessageDialog(null, "Tienes $ "+ Math.round(cambioDolarAPesos) + pesos.nombre);
		    		break;
		        
		    case "De Pesos a Dólar":
					double cambioPesosADolar = dolar.cambioLocalADivisa(valorDeCambio, pesos.valor,dolar.valor);
					JOptionPane.showMessageDialog(null, "Tienes $ "+ String.format("%.4f",cambioPesosADolar)+ dolar.nombre);
					break;
			
		    case "De Euros a Pesos":		
		    		double cambioEurosAPesos = euro.cambioDivisaALocal(euro.valor, valorDeCambio, pesos.valor);
		    		JOptionPane.showMessageDialog(null, "Tienes $ "+ Math.round(cambioEurosAPesos) + pesos.nombre);
		    		break;
		    
		    case "De Pesos a Euros":		
		    		double cambioPesosAEuros = euro.cambioLocalADivisa(valorDeCambio, pesos.valor,euro.valor);
		    		JOptionPane.showMessageDialog(null, "Tienes $ "+ String.format("%.4f",cambioPesosAEuros)+ euro.nombre);
		    		break;
		    
		    case "De Libras Esterlinas a Pesos":		
	    		double cambioLibrasAPesos = libraEsterlina.cambioDivisaALocal(libraEsterlina.valor, valorDeCambio, pesos.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ Math.round(cambioLibrasAPesos) + pesos.nombre);
	    		break;
	    
		    case "De Pesos a Libras Esterlinas":		
	    		double cambioPesosALibras = libraEsterlina.cambioLocalADivisa(valorDeCambio, pesos.valor,libraEsterlina.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ String.format("%.4f",cambioPesosALibras)+ libraEsterlina.nombre);
	    		break;
	    	
		    case "De Yen Japones a Pesos":		
	    		double cambioYenJaponesAPesos = yenJapones.cambioDivisaALocal(yenJapones.valor, valorDeCambio, pesos.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ Math.round(cambioYenJaponesAPesos) + pesos.nombre);
	    		break;
	    
		    case "De Pesos a Yen Japones":		
	    		double cambioPesosAYenJapones = yenJapones.cambioLocalADivisa(valorDeCambio, pesos.valor,yenJapones.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ String.format("%.4f",cambioPesosAYenJapones)+ yenJapones.nombre);
	    		break;
	    		
		    case "De Won Sur Coreano a Pesos":		
	    		double cambioWonSurCoreanoAPesos = wonSurCoreano.cambioDivisaALocal(wonSurCoreano.valor, valorDeCambio, pesos.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ Math.round(cambioWonSurCoreanoAPesos) + pesos.nombre);
	    		break;
	    
		    case "De Pesos a Won Sur Coreano":		
	    		double cambioPesosAWonSurCoreano = wonSurCoreano.cambioLocalADivisa(valorDeCambio, pesos.valor,wonSurCoreano.valor);
	    		JOptionPane.showMessageDialog(null, "Tienes $ "+ String.format("%.4f",cambioPesosAWonSurCoreano)+ wonSurCoreano.nombre);
	    		break;
		       
		 }
		
     }
}