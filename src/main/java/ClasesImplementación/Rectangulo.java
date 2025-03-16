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

public class Rectangulo implements InterfazFiguraGeometrica<Double>{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public Double area() {
        return base * altura;
    }

    @Override
    public Double perimetro() {
        return 2 * (base + altura);
    }
    
}
