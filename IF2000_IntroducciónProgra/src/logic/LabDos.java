/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;

/**
 *
 * @author yeire
 */
public class LabDos {

    public LabDos() {
    }
    
    
    public void ejercicio1 (){
        //Realizar la suma de todos los números pares entre 2 y 1000
        
        int suma=0;
        
        for (int i = 2; i <= 1000; i++) {
            if (i%2==0){
                suma+=i;
            }
            
        }
        System.out.println("El resultado de la suma de los numeros pares entre el numero 2 y el 1000 es: "+suma);
    }
    
    
    public void ejercicio2(){
        //Realizar un algoritmo que permita convertir temperaturas dadas en grados Celsius a 
        //temperaturas en grados Fahrenheit. F=9/5 (C + 32)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los grados celcius que quiere transformar a fahrenheit: ");
        int c = sc.nextInt();
        
        
        double grados= (c*9.0/5.0)+32;
        
        System.out.println("En total los grados en fahrenheit son: "+grados);
        
        sc.close();
    }
    
    
    public void ejercicio3(){
        /*Programa que lee un numero entero X y otro número entero N y, calcula la enésima
           potencia de X. X^n*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el numero al cual quiere calcular la enesima potencia de este: ");
        int x= sc.nextInt();
        
        System.out.println("Ingrese otro numero para desarrollar la formula: ");
        int n= sc.nextInt();
        
        double result=Math.pow(x, n);
        
        System.out.println("En total la enesima potencia de "+x+" es: "+result);
        
        sc.close();
    }
    
    public void ejercicio4(){
        /*Elabore un DF que reciba del teclado un número e imprima el mes del año al cual
           corresponde ese número.*/
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para mostrar el mes que respresenta (1 al 12)");
        int mes=sc.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("El mes seleccionado es Enero");
                break;
            case 2:
                System.out.println("El mes seleccionado es Febrero");
                break;
            case 3:
                System.out.println("El mes seleccionado es Marzo");
                break;
            case 4:
                System.out.println("El mes seleccionado es  Abril");
                break;
            case 5 :
                System.out.println("El mes seleccionado es Mayo");
                break;
            case 6:
                System.out.println("El mes seleccionado es Junio");
                break;
            case 7:
                System.out.println("El mes seleccionado es Julio");
                break;
            case 8:
                System.out.println("El mes seleccionado es Agosto");
                break;
            case 9:
                System.out.println("El mes seleccionado es Septiembre");
                break;
            case 10:
                System.out.println("El mes seleccionado es Octubre");
                break;
            case 11:
                System.out.println("El mes seleccionado es Noviembre");
                break;
            case 12:
                System.out.println("El mes seleccionado es Diciembre");
                break;
            default:
                System.out.println("El numero "+mes+" no es equivalente a ningun mes (estos van del numero 1 al 12)");
                break;
            }
        sc.close();
    }
    
    public void ejercicio5(){
        /*Calcular e imprimir el resultado de la evaluación de la siguiente funcion:
                                F(x)= {x+5, ∀ x > 0
                                          {X², ∀ x < 0
                                          {1, x=0*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de X");
        int x = sc.nextInt();
        
        int resultado =0;
        
        if (x>0){
            resultado = x+5;  
        }else if (x < 0){
            resultado = x*x;  
        } else{
            resultado = 1;
        }
        System.out.println("El resultado de la operacion es: "+resultado);
        sc.close();
    }
    
    
    public void ejercicio6(){
        /*Diseñar un algoritmo que calcule el área de un triángulo en funcion de las longitudes de sus lados.
                Área= raíz (p (p-a) (p-b) (p-c), p=(a + b + c)/2 donde p es el perímetro y a, b, c es el
                    valor de lo que mide cada lado.*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la medida de los lados del triangulo: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        int p=(a+b+c)/2;
        double area =Math.sqrt(p*(p-a) * (p-b) * (p-c));
        
        System.out.println("La medida del area del triangulo en funcion de la medida de sus lados es: "+area);
        
        sc.close();
    }
}
