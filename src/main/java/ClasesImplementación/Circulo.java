/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazFiguraGeometrica;
/**
 *
 * @author xioma
 */

public class Circulo implements InterfazFiguraGeometrica<Double>{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}


