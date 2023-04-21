package conversorTemperatura;

import javax.swing.JOptionPane;

public class Temperatura {
	
	
	public double convertirDeFahrenheitACelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		celsius = (double)Math.round(celsius * 100d)/100;
		
		JOptionPane.showMessageDialog(null, fahrenheit + " Grados Fahrenheit son " + celsius + " Celsius");
		
		return celsius;
	}
	
	
	public double convertirDeCelsiusAFahrenheit(double celsius) {
		
		double fahrenheit = (1.8 * celsius) + 32;
		
        fahrenheit = (double)Math.round(fahrenheit * 100d)/100;
		
		JOptionPane.showMessageDialog(null, celsius + " Grados Celsius son " + fahrenheit + " Fahrenheit");
				
		return fahrenheit;
		
	}
	
	public double convertirDeKelvinACelsius(double kelvin) {
		
		double celsius = kelvin - 273.15;
		
        celsius = (double)Math.round(celsius * 100d)/100;
		
		JOptionPane.showMessageDialog(null, kelvin + " Grados Kelvin son " + celsius + " Celsius");
				
		return celsius;
	}
	
	
	public double convertirDeCelsiusAKelvin(double celsius) {
		
        double kelvin = celsius + 273.15;
        
        kelvin = (double)Math.round(kelvin * 100d)/100;
		
		JOptionPane.showMessageDialog(null, celsius + " Grados Celsius son " + kelvin + " Kelvin");
		  	
		return kelvin;
	}
	
	
	public double convertirDeKelvinAFahrenheit(double kelvin) {
		
		double fahrenheit = ((kelvin - 273.15) * 1.8) + 32;
		
	    fahrenheit = (double)Math.round(fahrenheit * 100d)/100;
		
		JOptionPane.showMessageDialog(null, kelvin + " Grados Kelvin son " + fahrenheit + " Fahrenheit");
			
		return fahrenheit;
		
	}
	
	
	public double convertirDeFahrenheitAKelvin(double fahrenheit) {
		
        double kelvin = ((fahrenheit - 32) / 1.8) + 273.15;
        
        kelvin = (double)Math.round(kelvin * 100d)/100;
		
		JOptionPane.showMessageDialog(null, fahrenheit + " Grados Fahrenheit son " + kelvin + " Kelvin");
				
		return kelvin;
		
	}
	
	
	
}
