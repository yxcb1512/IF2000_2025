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
                System.out.println();

       
            }
        System.out.println("Este anterior fue un ejemplo en clase");
}
    
    /*A. Realice un algoritmo que permita formar la siguiente figura:
            * * * * * *
            *             *
            *             *
            *             *
            *             *
            * * * * * *
   */      //CORREGIR PARA QUE EL CENTRO QUEDE VACIO
    
    public void ejercicioA(int n){
        
        System.out.println();
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
            
            System.out.println();
        }
        }
        

          

    public void ejercicioB(int n){
        
        System.out.println();
        for (int i = 1; i <= n ; i++) {
            
            for (int j = 1; j <=(n-1); j++) {
                System.out.print(" "); 
            }
        
            for (int k = n; k >=i; k--) {
                System.out.print("*"); 
            }
             
            System.out.println("");
        }
        
        
     
    }
    
    
    public void ejercicioC(int n){
        
              System.out.println();
        for (int i = 1; i <= n ; i++) {
            
            for (int j = 1; j <=(n+i); j++) {
                System.out.print(" "); 
            }
        
            for (int k = n; k >=i; k--) {
                System.out.print("*"); 
            }
             
            System.out.println("");
        }  
    }


/*D. Realice un algoritmo que permita ingresar 10 números enteros en forma desordenada en un
Arreglo de tamaño 10 y luego ordenar ascendentemente el mismo, al final deberá realizar la
impresión del arreglo para mostrar el resultado.
*/
    
   public void ejercicioD(int [] numeros){
       
       for (int i = 0; i < numeros.length-1; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i]>numeros[j]){
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros [j] = temp;
                }
               
           }
           
       }
       System.out.println("Los numeros ordenados en forma ascendente son: ");
       for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
           
       }
       
   }
}

    
