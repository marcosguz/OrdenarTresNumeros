
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class OrdenarNumeros {
    
    Scanner ingreso = new Scanner(System.in);
    int numberOne, numberTwo, numbreThree;

    
    public void ingresarNumeros(){
    
        System.out.println("Ingrese el primer número:");
        numberOne = ingreso.nextInt();
        System.out.println("Ingrese el segundo número:");
        numberTwo = ingreso.nextInt();
        System.out.println("Ingrese el tercer número:");
        numbreThree = ingreso.nextInt();
        
    }
    
    public void ordenarNumeros(){
        
        if(numberOne > numberTwo) {
            if(numberOne > numbreThree) {
                if(numberTwo > numbreThree) {
                    System.out.println("Orden Ascendente: " + numbreThree + " " + numberTwo + " " + numberOne);
                    System.out.println("Orden descendente: " + numberOne + " " + numberTwo + " " + numbreThree);                 
                }else {
                    System.out.println("Orden Ascendente: " + numberOne + " " + numbreThree + " " + numberTwo);
                    System.out.println("Orden descendente: " + numberTwo + " " + numbreThree + " " + numberOne);
                }
            }else {
                System.out.println("Orden Ascendente: " + numberTwo + " " + numberOne + " " + numbreThree);
                System.out.println("Orden descendente: " + numbreThree + " " + numberOne + " " + numberTwo);
            }
        }else {
            if(numberTwo > numberOne) {
                if(numberOne > numbreThree) {
                    System.out.println("Orden Ascendente: " + numbreThree + " " + numberOne + " " + numberTwo);
                    System.out.println("Orden descendente: " + numberTwo + " " + numberOne + " " + numbreThree);
                }else {
                    System.out.println("Orden Ascendente: " + numberOne + " " + numbreThree + " " + numberTwo);
                    System.out.println("Orden descendente: " + numberTwo + " " + numbreThree + " " + numberOne);
                }              
            }else {
                System.out.println("Orden Ascendente: " + numberOne + " " + numberTwo + " " + numbreThree);
                System.out.println("Orden descendente: " + numbreThree + " " + numberTwo + " " + numberOne);
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        OrdenarNumeros numerosOrdenados = new OrdenarNumeros();
        numerosOrdenados.ingresarNumeros();
        numerosOrdenados.ordenarNumeros();
        
    }
}
