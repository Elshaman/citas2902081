package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;

public class Enfermero extends Usuario {

    private List<String> procedimientos;

    public Enfermero(int id, 
                     String nombres,
                     String apellidos, 
                     TipoDocumento tipoDocumento,
                     Long numeroDocumento) {
        //1. llamar al constructor de 
        // la superclase                
        super(id, nombres,
              apellidos, tipoDocumento,
               numeroDocumento);
        //2. inicializar atributos
        // intrinsecos del objeto
        this.procedimientos = new ArrayList<String>();
        
    }

    public void addProcedure(String procedure){
        //añadir el procedimiento a 
        // a la lista de procedimientos
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }

    

    
    

}
