/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author yeire
 */
public class LabUno {
   
    public void ejercicioA(int n){
    //Diseñe un DF que reciba un número entero y determine si es par o impar
    
        if (n%2==0){
            System.out.println("El numero "+n+" es par");
        }else{
            System.out.println("El numero "+n+" es impar");
        }
        
    }
    
    public void ejercicioB(int n){
        //Hacer un DF que calcula e imprime el valor absoluto de un número.
        
        int absoluto=0;
        
            if(n>=0){
                absoluto=n;
                System.out.println("El numero absoluto de |"+n+"| es "+absoluto);
            }else{
                absoluto=-n;
                System.out.println("El numero absoluto de |"+n+"| es "+absoluto);
            }
    }
}
