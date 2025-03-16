/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazAnimal;
/**
 *
 * @author xioma
 */
public class Perro implements InterfazAnimal<String>{

    @Override
    public String hacerSonido() {
        return "El perro ladra fuerte.";
    }

    @Override
    public String mover() {
        return "El perro corre una larga distancia.";
    }
    
}
