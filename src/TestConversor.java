
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author felip
 */
public class TestConversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    int input = 0; 
    
    while(input != 3){
        
        Conversor.Menu();
        input = sc.nextInt();
        
        switch(input){
            
            case 1:
                Conversor.Convertir("cm", "m", 0.01, sc);
                break;
            case 2:
                Conversor.Convertir("m", "cm", 100, sc);
                break;
            case 3:
                System.out.println("Ups! Salio del programa, vuelva pronto");
                break;
            default:
                System.out.println("Eliga una opcion correcta");
                break;
        }
        System.out.println();
        
    }
    
    sc.close();
        
        
        
        
        
    }
    
}
