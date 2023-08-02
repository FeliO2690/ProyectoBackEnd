
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Conversor {
    
    public static void Menu(){
        
        System.out.println("""
                           WELCOME TO CONVERSOR
                           1.-cm ->> m
                           2.- m ->> cm
                           3.-Salir
                           Choose the correct option:
                           
                           """);
        
        
    }
    
    public static void Convertir(String unidadOrigen, String unidadDestino, double cantidadOrigen, Scanner sc){
        double valor=0;
        System.out.println("Ha elegido: " +unidadOrigen+ "->>" +unidadDestino);
        System.out.println("Ingrese un valor: ");
        try{
           
            valor = sc.nextDouble();
            if(valor < 0){
                System.out.println("No puedes ingresar numeros negativos");
            
            }else{
                double resultado = valor * cantidadOrigen;
                System.out.println("La conversion es: " +resultado);
                
            }
          
        }catch(Exception e ){
            e.printStackTrace();
            
        }
        
        
        
        
    }
    
    
    
    
}
