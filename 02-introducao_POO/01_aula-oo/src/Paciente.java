public class Paciente {
    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {
        double imcCalculado = peso / (altura * altura);
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
