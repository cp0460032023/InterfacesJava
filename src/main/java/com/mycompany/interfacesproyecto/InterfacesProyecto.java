 package com.mycompany.InterfacesProyecto;

import Interfaces.InterfazAnimal;
import ClasesImplementación.Gato;
import ClasesImplementación.Perro;

import Interfaces.InterfazVehiculo;
import ClasesImplementación.Coche;
import ClasesImplementación.Bicicleta;

import Interfaces.InterfazPago;
import ClasesImplementación.PagoConEfectivo;
import ClasesImplementación.PagoConTarjeta;

import Interfaces.InterfazFiguraGeometrica;
import ClasesImplementación.Rectangulo;
import ClasesImplementación.Circulo;

import Interfaces.InterfazTrabajador;
import ClasesImplementación.Desarrollador;
import ClasesImplementación.Diseñador;

import Interfaces.InterfazOrdenable;
import ClasesImplementación.ListaNumeros;

import Interfaces.InterfazAlimentacion;
import ClasesImplementación.Animal;
import ClasesImplementación.Persona;

import Interfaces.InterfazNotificable;
import ClasesImplementación.CorreoElectronico;
import ClasesImplementación.SMS;

import Interfaces.InterfazComparable;
import ClasesImplementación.Producto;

import Interfaces.InterfazDescontable;
import ClasesImplementación.DescuentoFijo;
import ClasesImplementación.DescuentoPorcentaje;

import java.util.Scanner;

/**
 *
 * @author xioma
 */
 public class InterfacesProyecto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Animal
        InterfazAnimal<String> perro = new Perro();
        InterfazAnimal<String> gato = new Gato();
        // Perro
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento del perro:");
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());       
        // Gato
        System.out.println("\nComportamiento del gato:");
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
        
        // Vehiculo
        InterfazVehiculo<String> coche = new Coche();
        InterfazVehiculo<String> bicicleta = new Bicicleta();
        // Coche
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Movimiento del coche:");
        System.out.println(coche.arrancar());
        System.out.println(coche.detener()); 
        // Bicicleta
        System.out.println("\nMovimiento de la bicicleta:");
        System.out.println(bicicleta.arrancar());
        System.out.println(bicicleta.detener()); 
        
        // Pago
        InterfazPago<String> pagoTarjeta = new PagoConTarjeta();
        InterfazPago<String> pagoEfectivo = new PagoConEfectivo();
        // Pago con tarjeta
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Pago con tarjeta:");
        System.out.println(pagoTarjeta.procesarPago(150.75));
        // Pago con efectivo
        System.out.println("\nPago con efectivo:");
        System.out.println(pagoEfectivo.procesarPago(80.00));
        
        // Figura geometrica
        // Circulo
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        InterfazFiguraGeometrica<Double> circulo = new Circulo(radio);
        System.out.println("\nÁrea: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());
        // Rectangulo
        System.out.print("\nIngrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        InterfazFiguraGeometrica<Double> rectangulo = new Rectangulo(base, altura);
        System.out.println("\nÁrea: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());
        scanner.close();
        
        // Trabajador
        InterfazTrabajador<String> desarrollador = new Desarrollador();
        InterfazTrabajador<String> diseñador = new Diseñador();
        // Desarrollador
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Tarea del desarrollador:");
        System.out.println(desarrollador.trabajar());
        // Diseñador
        System.out.println("\nTarea del diseñador:");
        System.out.println(diseñador.trabajar());
        
        // Ordenable
        InterfazOrdenable<String> listaNumeros = new ListaNumeros();
        // Lista de números
        System.out.println("------------------------------------------------------------------------");
        System.out.println(listaNumeros.mostrarLista());
        System.out.println("\n" + listaNumeros.ordenar());
        
        // Alimentación
        InterfazAlimentacion<String> persona = new Persona();
        InterfazAlimentacion<String> animal = new Animal();
        //Persona
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Comportamiento de la persona:");
        System.out.println(persona.comer());   
        // Animal
        System.out.println("\nComportamiento del animal:");
        System.out.println(animal.comer());
        
        // Notificable
        InterfazNotificable<String> correoElectronico = new CorreoElectronico();
        InterfazNotificable<String> sms = new SMS();
        // Correo electrónico
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Notificación de correo:");
        System.out.println(correoElectronico.enviarNotificacion());  
        // SMS
        System.out.println("\nNotificación de SMS:");
        System.out.println(sms.enviarNotificacion());  
        
        // ComparableObjeto
        Producto producto1 = new Producto(150.0, "Laptop ASUS");
        Producto producto2 = new Producto(200.0, "Impresora HP");
        // Producto
        System.out.println("------------------------------------------------------------------------");
        System.out.println(producto1);
        System.out.println(producto2); 
        System.out.println("\n" + producto1.comparar(producto2));
        
        // Descontable
        InterfazDescontable<Double> descuentoPorcentaje = new DescuentoPorcentaje(20);  // Descuento del 20%
        InterfazDescontable<Double> descuentoFijo = new DescuentoFijo(10);  // Descuento fijo de 10 dolares
        // Descuento
        System.out.println("------------------------------------------------------------------------");
        double precio = 50.0;  // Precio original
        System.out.println("Precio original: $" + precio);
        System.out.println("\nDescuento por porcentaje (20%) en el precio de $" + precio + ": $" + descuentoPorcentaje.calcularDescuento(precio));
        System.out.println("Descuento fijo de 10 dolares en el precio de $" + precio + ": $" + descuentoFijo.calcularDescuento(precio));
    } 
}

