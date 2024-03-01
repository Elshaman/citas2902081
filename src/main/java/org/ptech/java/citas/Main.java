package org.ptech.java.citas;

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Main {
    public static void main(String[] args) {
       
        //Crear un medico
        Medico m1 = new Medico(1, 
                       "Cristian", 
                       "Buitrago",
                       TipoDocumento.CC , 
                       23124141224L,
                       3344554L , 
                       Especialidad.CARDIOLOGIA);
        System.out.println("id del medico:" + m1.getId());  

        //Crear un enfermero : 
        Enfermero e1 = new Enfermero(1,
                                "Alejandra",
                                 "Lopez", 
                                 TipoDocumento.PPT, 
                                 2342342L);
        
        //añadir 2 procedimientos al enfermero
        e1.addProcedure("Aplicar Inyecciones");
        e1.addProcedure("Lavado de oidos");

        //recorrer los procedimientos de e1
        for( String p : e1.getProcedimientos()){
                System.out.println("Procedimiento:" + p);
        }
        
        

        

    }
}