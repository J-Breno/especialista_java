public class Principal {
    public static void main(String[] args) {
        CalculadoraImc paciente = new CalculadoraImc();
        paciente.altura = 1.82;
        paciente.peso = 75;

        IndiceMassaCorporal imc = paciente.calcular();

        System.out.println(imc.resultado);
    }
}
