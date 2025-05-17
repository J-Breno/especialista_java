public class CalculadoraImc {
    double peso;
    double altura;

    IndiceMassaCorporal calcular() {
        double imcCalculado = peso / (altura * altura);
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
