// Ana Carolina

public class ConversorTemperatura {

    // Método para converter Celsius em Fahrenheit: (C * 9/5) + 32
    double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Método para converter Fahrenheit em Celsius: (F - 32) * 5/9
    double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Método principal para testar as conversões
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double tempCelsius = 25.0;
        double tempFahrenheit = 77.0;

        System.out.println("--- Testando Conversões ---");
        
        double resultadoF = conversor.celsiusParaFahrenheit(tempCelsius);
        System.out.printf("%.1f ºC equivalem a %.1f ºF\n", tempCelsius, resultadoF);

        double resultadoC = conversor.fahrenheitParaCelsius(tempFahrenheit);
        System.out.printf("%.1f ºF equivalem a %.1f ºC\n", tempFahrenheit, resultadoC);
    }
}