/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazVehiculo;
/**
 *
 * @author xioma
 */
public class Bicicleta implements InterfazVehiculo<String>{

    @Override
    public String arrancar() {
        return "La bicicleta comienza a moverse.";
    }

    @Override
    public String detener() {
        return "La bicicleta se ha detenido.";
    }
    
}
