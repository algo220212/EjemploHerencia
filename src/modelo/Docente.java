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
public class Docente extends Trabajador{
    private String tipo;
    private String nivel;

    public Docente(String tipo, String nivel, String dependencia, float sueldo, String documento, String paterno, String materno, String nombres, String codigo, int edad) {
        super(dependencia, sueldo, documento, paterno, materno, nombres, codigo, edad);
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Docente(String tipo, String nivel, String dependencia, float sueldo, String documento, String paterno, String nombres, String codigo) {
        super(dependencia, sueldo, documento, paterno, nombres, codigo);
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return  this.getCodigo() + "\t"  + this.getPaterno()+"\t" + this.getNombres()+"\t" + 
                this.getSueldo()+"\t"  + this.getDependencia() +"\t"  +tipo + "\t" + nivel ;
    }

    
}
