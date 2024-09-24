package com.iplacex.practica;
import java.util.Scanner;
/**
 *
 * @author  Robinson Concha
 */
public class Pato {
      public static void main(String args []){
      System.out.println("Hola Pato");
      //Operaciones: aritmetica y ley de signos
      int numeroUno =6;
      int numeroDos =6;
      double resultado =0;
      double resultado2 =0;
      //Aplicando la ley de signos primero divide 
      resultado = numeroUno + numeroDos /2;
      //Si queremos sacar un promedio por ejemplo debemos poner la operacion principal entre parentesis
      resultado2 = (numeroUno + numeroDos) /2;
      //Aplicando la ley de signos primero divide 
      System.out.println("El resultado es:" +resultado);
      
      System.out.println("El resultado aplicando ley de signos es:" +resultado2);
      System.out.println("*****************************************************");
      System.out.println("**************Estructuras de control*****************");
      System.out.println("*****************************************************");
      
      //Condicionales if else Ejemplo promedio notas
      System.out.println("**Condicionales if else Ejemplo promedio notas*******");
      int matematicas = 5;
      int biologia = 3;
      int quimica = 7;
      int promedio = 0;
      
      promedio = (matematicas + biologia + quimica)/3;
      
      if(promedio >=6){
      System.out.println("El alumno aprobo con promedio: " + promedio);
      }else{
      System.out.println("El alumno reprobo con promedio: " + promedio);
      }
      System.out.println("*****************************************************");
      System.out.println("*****************************************************");
      // Estructuras condicionales anidadas
      int operacion = 4;
      int num_uno = 12;
      int num_dos = 4;
      int total=0;
      
      if(operacion == 1){
      total = num_uno + num_dos;
      System.out.println("El resultado de la suma es: " + total);
      }else if(operacion == 2){
          total = num_uno - num_dos;
          System.out.println("El resultado de la resta es : " + total);    
      }else if(operacion == 3){
          total = num_uno * num_dos;
          System.out.println("El resultado de la multiplicacion es : " + total);   
      }else if(operacion == 4){
          total = num_uno / num_dos;
          System.out.println("El resultado de la division es : " + total);  
      }else{
          System.out.println("La opcion ingresada no es valida");   
      }
      System.out.println("*****************************************************");
      System.out.println("*****************************************************");
      
      //pedir datos a usuario con Scanner "importar libreria java.util"
      Scanner scan = new Scanner(System.in);
      String nombre ="";
      int numUno = 0,numDos =0,resultadoOperacion = 0;
      
      System.out.println("Ingrese su nombre");
      nombre = scan.nextLine();
      
      System.out.println("Ingresa el primer numero");
      numUno = scan.nextInt();
      
      System.out.println("Ingresa el segundo numero");
      numDos = scan.nextInt();
      
      resultadoOperacion = numUno + numDos;
      
      System.out.println("Hola " + nombre + " el resultado de la operacion es: " + resultadoOperacion);
   
      
      //Operadores relacionales <> == != <= >=
      //Operadores Lógicos && = and ,|| or
      Scanner entrada = new Scanner(System.in);
      String name = "";
      int clave = 0;
      int antiguedad = 0;
      System.out.println("*************************************************************\n");
      System.out.println("****Bienvenido al sistema vacacional de  Synapsis company******");
      System.out.println("***************************************************************");
      System.out.println("***************************************************************");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Ingrese el nombre del empleado");
      name = entrada.nextLine();
      System.out.println("");
      System.out.println("Ingrese la Clave del empleado");
      clave = entrada.nextInt();
      System.out.println("");
      System.out.println("Ingrese antiguedad del empleado");
      antiguedad = entrada.nextInt();
      System.out.println("");
      
      if(clave == 1){
        if(antiguedad == 1){
            System.out.println("el trabajador " +name +" tiene derecho a 6 dias de vacaciones");
        }else if(antiguedad >=2 && antiguedad <=6){
        System.out.println("el trabajador " + name+" tiene derecho a 14 dias de vacaciones");
        }else if(antiguedad >= 7){
        System.out.println("el trabajador " + name + "tiene derecho a 20  dias de vacaciones");
        }
      }else if(clave == 2){
          if(antiguedad == 1){
            System.out.println("el trabajador " +name +" tiene derecho a 7 dias de vacaciones");
        }else if(antiguedad >=2 && antiguedad <=6){
        System.out.println("el trabajador " + name+" tiene derecho a 15 dias de vacaciones" );
        }else if(antiguedad >= 7){
        System.out.println("el trabajador "+ name + "tiene derecho a 22  dias de vacaciones");
        }
      
      }else if(clave == 3){
      if(antiguedad == 1){
            System.out.println("el trabajador " +name +" tiene derecho a 10 dias de vacaciones");
        }else if(antiguedad >=2 && antiguedad <=6){
        System.out.println("el trabajador " + name+" tiene derecho a 20 dias de vacaciones" );
        }else if(antiguedad >= 7){
        System.out.println("el trabajador " + name + " tiene derecho a 30  dias de vacaciones");
        }
      }else{
       System.out.println("la clave ingresada no es valida");
      }
      
      System.out.println("***************************************************************");
      System.out.println("***************************************************************");
      
      //Estructura de control Switch case
      Scanner insert = new Scanner(System.in);
      int namberGuan = 5 ,namberChu = 3, resultadoTotal = 0;
      int parametro = 0;
      System.out.println("Ingrese una opcion del 1 al 4: 1=suma, 2=resta, 3=multiplicación, 4=division");
      parametro = insert.nextInt();
      switch(parametro){
        case 1:resultadoTotal = namberGuan + namberChu;
                System.out.println("El resultado de la suma es: " + resultadoTotal);
                 break;
      
        case 2:resultadoTotal = namberGuan - namberChu;
         System.out.println("El resultado de la resta es: " + resultadoTotal);
                 break;
      
        case 3:resultadoTotal = namberGuan * namberChu;
         System.out.println("El resultado de la multiplicacion es: " + resultadoTotal);
                 break;
      
        case 4:resultadoTotal = namberGuan / namberChu;
         System.out.println("El resultado de la division es: " + resultadoTotal);
                 break;
        default:  System.out.println("La opcion ingresada no es valida ");
      }
      System.out.println("***************************************************************");
      System.out.println("***************************************************************");
      
      // Ciclos o bucles
     
      System.out.println("***************************Ciclo for***************************");
       System.out.println("*****************Imprimir 1, 2, 3, 4, 5, incremento 1*********");
            
      for(int i = 1; i <= 5; i++){
      System.out.print(i + ", ");
      //System.out.println(i + ", ");
      }
      System.out.println("");
      System.out.println("");
      System.out.println("***************************************************************");
      System.out.println("***************************************************************");
      
      System.out.println("***************************Ciclo while*************************");
      System.out.println("****************Imprimir 1, 3, 5, 7, 9, incremento 2***********");
       //la variable se declara fuera del while
      int i =1;
      while(i < 10){
      System.out.print(i + ", ");
      i += 2;
      }
      System.out.println("");
      System.out.println("");
      System.out.println("***************************************************************");
      System.out.println("***************************************************************"); 
      
      System.out.println("*************************Ciclo do while************************");
      System.out.println("**********Imprimir desde 1000 a 0  con decremento de 200*******");
      int j = 1000;
        do{
          System.out.print(j +", ");
          j -= 200;
       }while(j >= 0);
      System.out.println("");
      System.out.println(""); 
      System.out.println("****************************************************************");
      System.out.println("****************************************************************");
      System.out.println("*****Bien Hecho " + nombre + " la practica hace al Maestro******");
      System.out.println("****************************************************************");
      }
    } 

