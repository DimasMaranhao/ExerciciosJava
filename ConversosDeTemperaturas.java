public class ConversosDeTemperaturas {
    public static void main(String[] args) {
        
        float celsius = 32.1f;
        float fahrenheit = (celsius * 1.8f +32);
        float kelvin = (celsius +273.15f);
        float reaumur = celsius * 0.8f;
        float rankine = (celsius * 1.8f + 32 + 459.67f);

        System.out.println("A temperatura em Celsius é: " + celsius + "°C");
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
        System.out.println("A temperatura em Kelvin é: " + kelvin + "°K");
        System.out.println("A temperatura em Réaumur é: " + reaumur + "°Re");
        System.out.println("A temperatura em Rankine é: " + rankine + "°Ra");
    
    }
}
