package app;

import java.util.Scanner;

/*Sabiendo la cantidad de bancos de cada aula, el usuario deberá ingresar la cantidad de alumnos
 * inscriptos para cursar tercer grado y el sistema deberá determinar qué aula es la indicada para 
 * la cantidad ingresada. La escuela ya sabe que la máxima capacidad de sus aulas es de 40 alumnos, 
 * por lo tanto, la cantidad de alumnos inscriptos que ingresa el usuario siempre será un número
 * menor o igual a 40. Las 3 aulas deben quedar ocupadas según los datos ingresados.*/


public class BuscarCliente {
        
    private static String[] n = new String[5];
    private static Scanner tec = new Scanner(System.in);
    private static String ningresado = null;
    private static boolean esta = false;

    public static void main(String[] args) {
    System.out.println("Bienvenido al ejercicio 2");
    
    n[0]= "Martin";
    n[1]= "Petra";
    n[2]= "Hermione";
    n[3]= "Luis";
    n[4]= "higinio";
    
    System.out.println("\nPorfavor ingrese el nombre del cliente que desea buscar: \n");
    ningresado = tec.next();
    
    
    for(int i=0; i < n.length; i++){
        if(n[i].equalsIgnoreCase(ningresado)){
            System.out.println(ningresado + " :Sí es cliente y está en la posición " + (i+1) );
            esta = true;
        } 
    }
    
    if(esta==false){
        System.out.println(ningresado +  " no es cliente");
    }
         
 } 
}
