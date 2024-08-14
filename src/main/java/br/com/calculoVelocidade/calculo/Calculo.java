package br.com.calculoVelocidade.calculo;

import java.text.DecimalFormat;

public class Calculo {

    public void CalculoVelocidadeEmKMH(double t1EmSegundos, double t2EmSegundos, double t3EmSegundos, double t4EmSegundos) {

        int distanciaEntreSensoresEmMetros = 4;
        DecimalFormat formatoDecimal = new DecimalFormat("0.00");

        double tempoSegundos = ((t1EmSegundos + t3EmSegundos)/2) + ((t2EmSegundos+t4EmSegundos)/2);

        double velocidade = (distanciaEntreSensoresEmMetros / tempoSegundos) * 3.6;

        System.out.println("Velocidade de " + formatoDecimal.format(velocidade) + " KM/H");
    }
}
