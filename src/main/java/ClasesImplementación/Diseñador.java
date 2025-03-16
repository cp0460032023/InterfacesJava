/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazTrabajador;
/**
 *
 * @author xioma
 */

public class Diseñador implements InterfazTrabajador<String>{

    @Override
    public String trabajar() {
        return "El diseñador está creando una interfaz gráfica.";
    }
    
}


