/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazDescontable;
/**
 *
 * @author xioma
 */

public class DescuentoFijo implements InterfazDescontable<Double>{

    private double cantidadFija;

    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public Double calcularDescuento(double precio) {
        double precioFinal = precio - cantidadFija;
        return Math.max(precioFinal, 0);
    }
    
}

