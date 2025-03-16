/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazPago;
/**
 *
 * @author xioma
 */
    
public class PagoConEfectivo implements InterfazPago<String>{

    @Override
    public String procesarPago(double cantidad) {
        return "Pago de $" + cantidad + " procesado en efectivo.";
    }
    
}
