/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*objeto 1 perro*/
        Perro perro1=new Perro();
        perro1.nombre="pepe";
        perro1.raza="pincher";
        perro1.color="negro";
        perro1.edad=3;
        perro1.peso=7;
        perro1.estatura=10;
        perro1.comida="pepitas";
        perro1.vive=true;
        perro1.sexo='M';
        perro1.comer();
        perro1.dormir();
        System.out.println(perro1.estadoPerro());
        perro1.mostrar();
        System.out.println();
        System.out.println();
        /**objeto 2 perro*/
        Perro perro2=new Perro();
        perro2.nombre="ela";
        perro2.sexo='F';
        perro2.color="Negra";
        perro2.edad=1;
        perro2.peso=3;
        perro2.estatura=5;
        perro2.comida="Frisby";
        perro2.vive=true;
        perro2.raza="Pincher";
        perro2.mostrar();
        System.out.println("");
        /**
         * parametros del constructor
         * nombre,raza,color,edad,estatura,peso,comida,sexo,vive
         */
        Perro perro3=new Perro("firualis","Criollo","Blanco",2,
                               5,4,"Carne",'M',true);
        perro3.comer();
        perro3.dormir();
        System.out.println(perro3.estadoPerro());
        perro3.mostrar();
        
        
        
        
    }
    
}
