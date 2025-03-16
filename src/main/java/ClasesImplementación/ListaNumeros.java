/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesImplementación;
import Interfaces.InterfazOrdenable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author xioma
 */

public class ListaNumeros implements InterfazOrdenable<String>{

    private List<Integer> numeros;

    public ListaNumeros() {
        // Inicializamos la lista dentro de la clase ListaNumeros
        this.numeros = Arrays.asList(5, 3, 8, 1, 9, 2, 13, 10);
    }
    
    @Override
    public String mostrarLista() {
        return "Lista original: " + numeros;
    }
    
    @Override
    public String ordenar() {
        Collections.sort(numeros);
        return "Lista ordenada: " + numeros;
    }
    
}


