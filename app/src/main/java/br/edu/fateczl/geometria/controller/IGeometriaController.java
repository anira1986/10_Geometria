/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.geometria.controller;

public interface IGeometriaController<T> {
    float calcularArea(T t);
    float calcularPerimetro(T t);
}
