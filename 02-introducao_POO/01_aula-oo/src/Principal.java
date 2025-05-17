public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 75;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        System.out.println(imc.resultado);
    }
}
