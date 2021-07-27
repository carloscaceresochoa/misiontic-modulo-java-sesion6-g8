package ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Perro {
    
    /**atributos**/
    public String nombre;
    public String raza;
    public String color;
    public int edad;
    public double estatura;
    public double peso;
    public String comida;
    public char sexo;
    public boolean vive;
    
    /**constructor sin parametros**/    
    public Perro(){
        this.nombre="Perro sin Nombre";
        this.raza="Sin Raza";
        this.color="Sin Color";
        this.edad=0;
        this.estatura=0.0;
        this.peso=0.0;
        this.comida="Sin Comida";
        this.sexo='N';
        this.vive=true;
       
        
    }
    /** constructor con parametros**/
    public Perro(String nombre,String raza,String color,int edad,
            double estatura,double peso,String comida,char sexo,
            boolean vive){
        System.out.println("Acabo de crear el objeto");
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.edad=edad;
        this.estatura=estatura;
        this.peso=peso;
        this.comida=comida;
        this.sexo=sexo;
        this.vive=vive;   
        
    }
    
    /**metodos**/
    
    public void comer(){
        System.out.println("El perro "+nombre+" esta comiendo "+comida);
    }
    public void dormir(){
        System.out.println("El perro "+nombre+" esta durmiendo");
    }  
    
    public void mostrar(){
        System.out.println("Perro");
        System.out.println("Nombre "+nombre);
        System.out.println("Sexo "+sexo);
        System.out.println("Raza "+raza);
        System.out.println("color "+color);
        System.out.println("Edad "+edad);
        System.out.println("estatura "+estatura);
        System.out.println("Peso "+peso);
        System.out.println("Comida "+comida);
        System.out.println("Vive "+vive);
    }
    
    public String estadoPerro(){
        
        return (peso<6)?"Bajo de Peso":"Buen Peso";
    
        
    }
    
   
    
}
