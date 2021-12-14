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
public class Administrativo extends Trabajador{
    private String cargo;

    public Administrativo(String cargo, String dependencia, float sueldo, String documento, String paterno, String materno, String nombres, String codigo, int edad) {
        super(dependencia, sueldo, documento, paterno, materno, nombres, codigo, edad);
        this.cargo = cargo;
    }

    public Administrativo(String cargo, String dependencia, float sueldo, String documento, String paterno, String nombres, String codigo) {
        super(dependencia, sueldo, documento, paterno, nombres, codigo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return this.getCodigo() + "\t"  + this.getPaterno()+"\t" + this.getNombres()+"\t" + cargo ;
    }
    
    
}
