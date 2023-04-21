package conversorTemperatura;

import javax.swing.JOptionPane;

public class CambioDeTemperatura {
	
		Temperatura temperatura = new Temperatura();
		
		public void ConvertirTemperatura (double valorTemperatura) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Fahrenheit","Grados Fahrenheit a Grados Celsius","Grados Celsius a Kelvin","Grados Kelvin a Celsius","Kelvin a Grados Fahrenheit","Fahrenheit a Grados Kelvin"}, "Seleccion")).toString();
        switch(opcion) {
        
        case "Grados Celsius a Grados Fahrenheit":
        	temperatura.convertirDeCelsiusAFahrenheit(valorTemperatura);
        	break;
        
        case "Grados Fahrenheit a Grados Celsius":
        	temperatura.convertirDeFahrenheitACelsius(valorTemperatura);
        	break;        	
        	
        case "Grados Celsius a Kelvin":
        	temperatura.convertirDeCelsiusAKelvin(valorTemperatura);
            break;
            
        case "Grados Kelvin a Celsius":
        	temperatura.convertirDeKelvinACelsius(valorTemperatura);
            break;                     
                 
        case "Kelvin a Grados Fahrenheit":
        	temperatura.convertirDeKelvinAFahrenheit(valorTemperatura);
        	break;
        
        case "Fahrenheit a Grados Kelvin":
        	temperatura.convertirDeFahrenheitAKelvin(valorTemperatura);
        	break;        	        	
        	
        }

	}

}
