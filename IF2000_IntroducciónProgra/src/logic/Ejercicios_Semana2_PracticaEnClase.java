/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author yeire
 */
public class Ejercicios_Semana2_PracticaEnClase {
  
    public Ejercicios_Semana2_PracticaEnClase(){
}
    
    public void quiz2_A_Primos(){
    
            System.out.println("");
    }
    
    public void  quiz2_B_piramide(int n){

        for (int i = 1; i<=n; i++) {
            //controla los espacios vacios
            for (int j = 1; j<=(n-i);j++){
            System.out.print(" ");
            }
            //controla los asteriscos
            for (int k = 1; k<=(2*i-1);k++){ 
                 System.out.print("*");
              }
                System.out.println(" ");

       
            }
}
    
    /*A. Realice un algoritmo que permita formar la siguiente figura:
            * * * * * *
            *             *
            *             *
            *             *
            *             *
            * * * * * *
   */      
    public void ejercicioA(int n){
        
        int espacio= n-2;
        
        for (int i = 0; i <=n-1; i++) {
            for (int j = 1; j <=(n/n); j++) {
                System.out.println("");
            }
            for (int k = 0; k <=(n-1); k++) {
                System.out.print("*  ");
            }
            
        }

            
}
}