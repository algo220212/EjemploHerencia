
package modelo;

public class PersonaArreglo {
    private Persona [] personas;
    private int indice;

    public PersonaArreglo(int tamaño) {
        this.personas = new Persona[tamaño];
        this.indice = 0;
    }
    
    public boolean agregar(Persona persona){
        boolean result = false;
        if(! estaLleno()){
            this.personas[this.indice] = persona;
            this.indice++;
            result = true;
        }
        return result;
    }

    private boolean estaLleno() {
        boolean result = false;
        if(this.personas.length == this.indice){
            result =true;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for(Persona p : this.personas){
            result += p + "\n";
        }
        return result;
    }
    
    
    
    
    
}
