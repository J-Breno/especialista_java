public class Principal {
    public static void main(String[] args) {
        CalculadoraImc paciente = new CalculadoraImc();
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        double altura = imc.peso = 1.82;
        double peso = imc.altura = 75;

        imc = paciente.calcular(peso, altura);

        if(imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade%n", altura, peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
