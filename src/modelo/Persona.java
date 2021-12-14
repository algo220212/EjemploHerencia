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
public abstract class   Persona {
    private String documento;
    private String paterno;
    private String materno;
    private String nombres;
    private String codigo;
    private int edad ;

    public Persona(String documento, String paterno, String materno, 
            String nombres, String codigo, int edad) {
        this.documento = documento;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.codigo = codigo;
        this.edad = edad;
    }

    public Persona(String documento, String paterno, 
            String nombres, String codigo) {
        this.documento = documento;
        this.paterno = paterno;
        this.nombres = nombres;
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return codigo + "\t" + documento + "\t" + paterno + "\t" + materno + 
                "\t" + nombres +  "\t" + edad  ;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
    
}
