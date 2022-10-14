package lab1_gerardocano2;

import java.util.Scanner;

public class Lab1_GerardoCano2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de calculo de promedio  ");
        System.out.print( "Ingrese su nombre: " ); //Se ingresa el nombre del usario
        String nombre = read.nextLine();
        
        //Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la notra final de la primera clase:" );
        double primeraClase = read.nextDouble();
        
        System.out.print("Ingrese la notra final de la segunda clase: ");
        double segundaClase = read.nextDouble();
        
        System.out.print("Ingrese la notra final de la tercera clase: ");
        double terceraClase = read.nextDouble();
        
        System.out.print("Ingrese la notra final de la cuartaclase: ");
        double cuartaClase = read.nextDouble();
        
        //Se calculo del promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //se imprime el calculo del promedio
        System.out.println(  nombre + " el promedio de las cuatro clases es  " + promedio);
               
    }
        
    
}
