/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */


package br.edu.fateczl.geometria.controller;

import br.edu.fateczl.geometria.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo> {

    @Override
    public float calcularArea(Circulo circulo) {
        float raio = circulo.getRaio();
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float calcularPerimetro(Circulo circulo) {
        float raio = circulo.getRaio(); 
        return (float) (2 * Math.PI * raio);
    }
}
