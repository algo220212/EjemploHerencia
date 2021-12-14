/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author OCA-UIE
 */
public class Alumno extends Persona{
    private String escuela;
    private float ponderado;

    public Alumno(String escuela, String documento, String paterno, 
            String materno, String nombres, String codigo, int edad) {
        super(documento, paterno, materno, nombres, codigo, edad);
        this.escuela = escuela;
    }

    public Alumno(String escuela, String documento, String paterno, 
            String nombres, String codigo) {
        super(documento, paterno, nombres, codigo);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public float getPonderado() {
        return ponderado;
    }

    public void setPonderado(float ponderado) {
        this.ponderado = ponderado;
    }

    @Override
    public String toString() {
        return  this.getCodigo() + "\t"  + this.getPaterno()+"\t" + this.getNombres()+"\t"+escuela + "\t" + ponderado ;
    }
    
    
    
    
}
