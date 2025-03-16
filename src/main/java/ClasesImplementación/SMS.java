/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ClasesImplementación;
import Interfaces.InterfazNotificable;
/**
 *
 * @author xioma
 */
public class SMS implements InterfazNotificable<String>{

    @Override
    public String enviarNotificacion() {
        return "Su pedido ha sido enviado.";
    }
    
}

