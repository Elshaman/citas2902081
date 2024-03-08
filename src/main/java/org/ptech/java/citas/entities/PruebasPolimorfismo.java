package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
        //instanciar un usuario
        Usuario u = new Medico(1, 
                               "Cristian" ,
                              "Buitrago", 
                               TipoDocumento.CE, 
                               324234234L , 
                               2344324L , 
                               Especialidad.DERMATOLOGIA);
        System.out.println(u.toString());                      
    }
}
