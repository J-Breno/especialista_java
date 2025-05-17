public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        Paciente joao = new Paciente();
        joao.peso = 75;
        joao.altura = 1.82;

        imc = calculadora.calcular(joao);

        if(imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f está com obesidade%n", joao.altura, joao.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
