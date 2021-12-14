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
public abstract class Trabajador extends Persona{
    private String dependencia;
    private float sueldo;

    public Trabajador(String dependencia, float sueldo, String documento, 
            String paterno, String materno, String nombres, String codigo, int edad) {
        super(documento, paterno, materno, nombres, codigo, edad);
        this.dependencia = dependencia;
        this.sueldo = sueldo;
    }

    public Trabajador(String dependencia, float sueldo, String documento, 
            String paterno, String nombres, String codigo) {
        super(documento, paterno, nombres, codigo);
        this.dependencia = dependencia;
        this.sueldo = sueldo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return     dependencia + "\t" + sueldo ;
    }
    
    
    
}
