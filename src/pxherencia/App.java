/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pxherencia;

import modelo.*;

/**
 *
 * @author OCA-UIE
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaArreglo personas = new PersonaArreglo(10);
        Alumno alumno = new Alumno("Ingenieria de Software", "70212547", "Diaz", "Jose", "22204030");
        alumno.setPonderado(15.4f);
        System.out.println(alumno);
        personas.agregar(alumno);
        
        Docente docente = new Docente("Parcial", "Auxiliar", "Fac. de Ingenieria de Sistemas", 1000, "40203157", "Zavaleta", "Jorge", "0A1987");
        System.out.println(docente);
        personas.agregar(docente);
        
        Persona persona ;
        persona = alumno;
        //System.out.println(persona);
        
        persona = new Docente("T Completo", "Asociado", "MAtematicas", 2000, "123456789", "Ramos", "Andres", "145231");
        
        System.out.println(persona);
        docente = (Docente)persona;
        personas.agregar(docente);
        //System.out.println(docente);
        
        personas.agregar(new Administrativo("Jefe de Personal", "Fac. Odontologia", 2000, "52547859", "Ruiz","Alvaro","145268" ));
        System.out.println("=======================================");
        System.out.println(personas);
    }
    
}
