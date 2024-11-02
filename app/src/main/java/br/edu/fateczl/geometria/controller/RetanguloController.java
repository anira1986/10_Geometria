package br.edu.fateczl.geometria.controller;

import br.edu.fateczl.geometria.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {

    @Override
    public float calcularArea(Retangulo retangulo) {
        return retangulo.getAltura() * retangulo.getBase();
    }

    @Override
    public float calcularPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getAltura() + retangulo.getBase());
    }
}
