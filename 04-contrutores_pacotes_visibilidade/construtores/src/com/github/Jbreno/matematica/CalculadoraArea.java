package com.github.Jbreno.matematica;

import static java.lang.Math.pow;

public class CalculadoraArea {
    public static final double PI = 3.14159265358979323846;

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * pow(raio, 2);
    }
}
