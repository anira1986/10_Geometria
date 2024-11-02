/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */



package br.edu.fateczl.geometria.model;

public class Circulo {

    private float diametro;

    public Circulo() {
        super();
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    // Método adicional para obter o raio com base no diâmetro
    public float getRaio() {
        return diametro / 2;
    }
}
