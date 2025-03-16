/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazAlimentacion;
/**
 *
 * @author xioma
 */
public class Animal implements InterfazAlimentacion<String>{

    @Override
    public String comer() {
        return "El animal está comiendo directamente del suelo.";
    }
    
}

