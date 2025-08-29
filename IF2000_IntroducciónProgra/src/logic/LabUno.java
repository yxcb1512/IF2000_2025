/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Arrays;

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
    
    public void ejercicioC(){
        //Diseñar un DF que imprima y sume la serie de números 3, 6, 9, 12, 15, … ,99
        
        int suma=0;
        System.out.println("La cadena es: ");
        for (int n = 0; n <= 99; n+=3) {
            System.out.print(n+" ");
            suma+=n;
        }
        System.out.println();
        System.out.println("El resultado de la suma en base con la cadena anterior es: "+suma);
    }

    public void ejercicioD(int uno, int dos, int tres){
        //Escriba un algoritmo que lea tres números y los imprima en orden ascendente.
        
        int[] numeros = {uno, dos, tres};
            Arrays.sort(numeros);
            System.out.println("Los numeros ordenados ascendentemente son: "+numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
}
    public void ejercicioE(int uno, int dos){
        //Hace un DF que lea 2 números: si son iguales que los multiplique, si el primero es mayor que el
        //segundo que los reste y si no que los sume. Debe imprimir el resultado final.
        
        if (uno==dos){
            int multi = uno*dos;
            System.out.println("El resultado de la multiplicacion es: "+multi);
        }else if (uno>dos){
        int resta=uno-dos;
            System.out.println("El resultado de la resta es: "+ resta);
    }else{
            int suma= uno+dos;
            System.out.println("El resultado de la suma es "+suma);
        }
        
    }
    
    public void ejercicioF(int cero, int uno, int dos, int tres, int cuatro, int cinco, int seis, int siete, int ocho, int nueve, int diez){
        //Programa que lee un número de notas con valores de 0 a 10, termina cuando se le introduce
        //una nota con el valor -1 y nos dice si hubo o no alguna con el valor 10.
        
        
        //HACERLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        
        
    }
    
    public void ejercicioG(){
        //Calcular el número de pulsaciones que debe tener una persona por cada 10 segundos de
        //ejercicio aeróbico, la formula se aplica de acuerdo al sexo es:
        //a. Femenino: numero_pulsaciones = (220 - edad)/10
        //b. Masculino: numero_pulsaciones = (210 - edad)/10
        
        
    }
    
    
    public void ejercicioH(){
        /*Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna
        como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de
        acuerdo con la siguiente tabla:
                Tiempo:                                             Utilidad:
                Menos de 1 año                                      5% del salario
                1 año o más y menos de 2 años                7% del salario
                2 años o más y menos de 5 años               10% del salario
                5 años o más y menos de 10 años             15% del salario
                10 años o más                                           20% del salario      */
        
    }
    
    public void ejercicioI(int n){
        // Diseñar un algoritmo para determinar si un número N es primo (un número es primo si
        // únicamente es divisible por el mismo y por la unidad)
        
        if (n%n==0 && n%1==0){
            System.out.print("El numero "+ n +" es un numero primo");
        }else{
            System.out.print("El numero "+n+" no es un numero primo");
        }
        
    }
    
    //HOLA CHAR COMO ESTAS?
}